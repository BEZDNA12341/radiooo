package ru.netology.stat;

public class RadioServicee {
    private int currentChannel;
    private int maxChannel =  9;
    private int minChannel =  0 ;

    private int currentVolume;
    private int maxVolume = 10;
    private int minVolume = 0;

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void nextChannel(int i) {
        if (currentChannel == maxChannel) {
            this.currentChannel = minChannel;
            return;
        }
        currentChannel++;
    }

    public void prevChannel() {
        if (currentChannel == minChannel) {
            this.currentChannel = maxChannel;
            return;
        }
        currentChannel--;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel > maxChannel) {
            this.currentChannel = maxChannel;
            return;
        }
        if (currentChannel < minChannel) {
            this.currentChannel = minChannel;
            return;
        }
        this.currentChannel = currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
        return;
    }
    ;
    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
        return;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }
}