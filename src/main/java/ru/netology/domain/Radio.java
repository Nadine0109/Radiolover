package ru.netology.domain;

public class Radio {
    private String name;
    private boolean on;
    private int minStation = 0;
    private int maxStation = 9;
    private int currentStation;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 10;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = 0;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = 9;
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
        if (nextStation > maxStation) {
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

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return maxVolume;
        }
        if (currentVolume < minVolume) {
            return minVolume;
        }
        this.currentVolume = currentVolume;
        return currentVolume;
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
        if (currentVolume <= minVolume) {
            return minVolume;
        }
        int volumePlus = setCurrentVolume(getCurrentVolume()) + 1;
        return volumePlus;
    }
}
