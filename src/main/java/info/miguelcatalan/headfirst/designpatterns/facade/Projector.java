package info.miguelcatalan.headfirst.designpatterns.facade;

class Projector {

    enum Mode {
        WIDE, SQUARE
    }

    private boolean isOn;
    private Mode currentMode;

    Projector() {
        this.isOn = false;
    }

    public void on() {
        isOn = true;
    }

    public void off() {
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    void setMode(Mode mode) {
        currentMode = mode;
    }

    public Mode getCurrentMode() {
        return currentMode;
    }
}
