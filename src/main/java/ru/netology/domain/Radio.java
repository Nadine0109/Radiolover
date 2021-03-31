package ru.netology.domain;

public class Radio {
    private String name;
    private boolean on;
    private int minStation = 0;
    private int maxStation = 10;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentStation;
    private int currentVolume;

    public Radio() {
    }

    public Radio(String name, boolean on, int minStation, int maxStation, int maxVolume, int minVolume, int currentStation, int currentVolume) {
        this.name = name;
        this.on = on;
        this.minStation = minStation;
        this.maxStation = maxStation;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.currentStation = currentStation;
        this.currentVolume = currentVolume;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int setCurrentStation(int currentStation) {

        if (currentStation > maxStation) {
            return maxStation;
        }
        if (currentStation < minStation) {
            return minStation;
        }
        this.currentStation = currentStation;
        return currentStation;
    }

    public int getNextStation() {
        int nextStation = setCurrentStation(getCurrentStation()) + 1;
        if (currentStation == maxStation) {
            return minStation;
        }
        return nextStation;
    }

    public int getPrevStation() {
        int prevStation = setCurrentStation(getCurrentStation()) - 1;
        if (currentStation == minStation) {
            return maxStation;
        }
        return prevStation;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public int setCurrentVolume(int currentVolume) {

        if (currentVolume >= maxVolume) {
            this.currentVolume = maxVolume;
            return currentVolume;
        }
        if (currentVolume <= minVolume) {
            this.currentVolume = minVolume;
            return currentVolume;
        } else {
            this.currentVolume = currentVolume;
            return currentVolume;
        }
    }

    public int getVolumeMinus() {

        if (currentVolume <= minVolume) {
            return minVolume;
        }
        int volumeMinus = setCurrentVolume(getCurrentVolume()) - 1;
        return volumeMinus;
    }

    public int getVolumePlus() {

        if (currentVolume >= maxVolume) {
            return maxVolume;
        }

        int volumePlus = setCurrentVolume(getCurrentVolume()) + 1;
        return volumePlus;
    }
}