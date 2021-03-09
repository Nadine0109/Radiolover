package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldGetAndSetCurrentStation() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(7);
        assertEquals(7, radio.getCurrentStation());
    }

    @Test
    void shouldGetAndSetCurrentStationAboveMax() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(11);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldGetAndSetCurrentStationUnderMin() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldGetNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        assertEquals(0, radio.getNextStation());

    }

    @Test
    void shouldGetNextStationAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(11);

        assertEquals(1, radio.getNextStation());

    }

    @Test
    void shouldGetPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        assertEquals(7, radio.getPrevStation());

    }

    @Test
    void shouldGetPrevStationUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        assertEquals(9, radio.getPrevStation());

    }

    @Test
    void shouldGetAndSetCurrentVolume() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(4);
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    void shouldGetAndSetCurrentVolumeAboveMax() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(11);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldGetAndSetCurrentVolumeUnderMin() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldGetVolumeMinus() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);

        assertEquals(8, radio.getVolumeMinus());
    }

    @Test
    void shouldGetVolumeMinusUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-3);

        assertEquals(0, radio.getVolumeMinus());
    }

    @Test
    void shouldGetVolumePlus() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);

        assertEquals(8, radio.getVolumePlus());
    }

    @Test
    void shouldGetVolumePlusAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(87);

        assertEquals(0, radio.getVolumePlus());
    }

    @Test
    void shouldGetVolumePlusMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        assertEquals(10, radio.getVolumePlus());
    }
}