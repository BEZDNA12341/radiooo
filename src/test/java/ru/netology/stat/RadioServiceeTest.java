package ru.netology.stat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioServiceeTest {
    @Test
    public void nextChannel() {
        RadioServicee station = new RadioServicee();
        station.setCurrentChannel(7);
        station.nextChannel(9);
        assertEquals(8, station.getCurrentChannel());
    }

    @Test
    public void prevChannel() {
        RadioServicee station = new RadioServicee();
        station.setCurrentChannel(0);
        station.prevChannel();
        assertEquals(9, station.getCurrentChannel());
    }

    @Test
    public void prevChannel12() {
        RadioServicee station = new RadioServicee();
        station.setCurrentChannel(1000);
        station.prevChannel();
        assertEquals(8, station.getCurrentChannel());
    }

    @Test
    public void nextChannel2() {
        //Канал после максимального числа
        RadioServicee station = new RadioServicee();
        station.setCurrentChannel(9);
        station.nextChannel(1);
        assertEquals(0, station.getCurrentChannel());
    }

    @Test
    public void nextChannelMulti() {
        RadioServicee station = new RadioServicee();
        station.setCurrentChannel(120);
        station.nextChannel(1);
        assertEquals(0, station.getCurrentChannel());
    }

    @Test
    public void setChannel() {
        RadioServicee station = new RadioServicee();
        station.setCurrentChannel(2);
        assertEquals(2, station.getCurrentChannel());
    }

    @Test
    public void setChannelAny() {
        RadioServicee station = new RadioServicee();
        station.setCurrentChannel(35);
        assertEquals(9, station.getCurrentChannel());
    }

    @Test
    public void nextChannelMinus() {
        RadioServicee station = new RadioServicee();
        station.setCurrentChannel(-500);
        station.nextChannel(1);
        assertEquals(1, station.getCurrentChannel());
    }

    @Test
    public void prevChannelMinus() {
        RadioServicee station = new RadioServicee();
        station.setCurrentChannel(-280);
        station.prevChannel();
        assertEquals(9, station.getCurrentChannel());
    }

    @Test
    public void setChannelMinus() {
        RadioServicee station = new RadioServicee();
        station.setCurrentChannel(-30);
        assertEquals(0, station.getCurrentChannel());
    }

    @Test
    void increaseVolume() {
        RadioServicee station = new RadioServicee();
        station.setCurrentVolume(9);
        station.increaseVolume();
        assertEquals(10, station.getCurrentVolume());
    }

    @Test
    void decreaseVolume() {
        RadioServicee station = new RadioServicee();
        station.setCurrentVolume(1);
        station.decreaseVolume();
        assertEquals(0, station.getCurrentVolume());
    }

    @Test
    public void increaseVolumeforVolume() {
        //увеличить громкость с любого значения до максимального
        RadioServicee station = new RadioServicee();
        station.setCurrentVolume(100);
        station.increaseVolume();
        assertEquals(10, station.getCurrentVolume());
    }

    @Test
    public void decreaseVolumeforVolume() {
        //уменьшить громкость с любого многозначного значения
        RadioServicee station = new RadioServicee();
        station.setCurrentVolume(100);
        station.decreaseVolume();
        assertEquals(9, station.getCurrentVolume());
    }

    @Test
    public void decreaseVolumeforMin() {
        //уменьшить громкость с минимального значения
        RadioServicee station = new RadioServicee();
        station.setCurrentVolume(0);
        station.decreaseVolume();
        assertEquals(0, station.getCurrentVolume());
    }

    @Test
    void increaseVolumeforMax() {
        //увеличить громкость с максимального значения
        RadioServicee station = new RadioServicee();
        station.setCurrentVolume(10);
        station.increaseVolume();
        assertEquals(10, station.getCurrentVolume());
    }

    @Test
    public void decreaseVolumeForMinus() {
        //уменьшить громкость с любого отрицательного значения
        RadioServicee station = new RadioServicee();
        station.setCurrentVolume(-100);
        station.decreaseVolume();
        assertEquals(0, station.getCurrentVolume());
    }

    @Test
    public void increaseVolumeForMinus() {
        //увеличить громкость с любого отрицательного значения
        RadioServicee station = new RadioServicee();
        station.setCurrentVolume(-100);
        station.increaseVolume();
        assertEquals(1, station.getCurrentVolume());
    }
}