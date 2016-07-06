package info.miguelcatalan.headfirst.designpatterns.facade;

class TheaterLights {
    private boolean isOn;
    private int currentDim;

    TheaterLights() {
        this.isOn = false;
        this.currentDim = 0;
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

    void dim(int dim) {
        currentDim = dim;
    }

    public int getCurrentDim() {
        return currentDim;
    }
}
