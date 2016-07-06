package info.miguelcatalan.headfirst.designpatterns.facade;

class Amplifier {
    private boolean isOn;
    private Playable source;
    private int volume;

    Amplifier() {
        this.isOn = false;
        this.volume = 0;
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

    void setDVD(Playable dvdPlayer) {
        this.source = dvdPlayer;
    }

    void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public String getSource() {
        return source.getClass().getSimpleName();
    }
}
