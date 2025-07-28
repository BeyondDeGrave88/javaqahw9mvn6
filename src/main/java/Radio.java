public class Radio {
    private int currentRadioStation;

    public int nextRadioStation() {
        if (currentRadioStation < 9) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
        return currentRadioStation;
    }

    public int prevRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation--;
        } else {
            currentRadioStation = 9;
        }
        return currentRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation (int RadioStation) {
        if (RadioStation < 0) {
            currentRadioStation = 0;
        } else if (RadioStation > 9) {
            currentRadioStation = 9;
        } else {
            currentRadioStation = RadioStation;
        }
    }


    private int currentVolume;

    public int increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 100;
        }
        return currentVolume;
    }

    public int decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
        return currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume (int volume) {
        if (volume < 0) {
            currentVolume = 0;
        } else if (volume > 100) {
            currentVolume = 100;
        } else {
            currentVolume = volume;
        }
    }
}