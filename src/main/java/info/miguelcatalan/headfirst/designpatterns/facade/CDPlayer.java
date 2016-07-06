package info.miguelcatalan.headfirst.designpatterns.facade;

class CDPlayer implements Playable {
    private boolean isOn;
    private String cd;

    CDPlayer() {
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

    public void play(String cd) {
        this.cd = cd;
    }
}
