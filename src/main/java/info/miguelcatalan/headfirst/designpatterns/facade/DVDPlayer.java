package info.miguelcatalan.headfirst.designpatterns.facade;

class DVDPlayer implements Playable {
    private boolean isOn;
    private String film;

    DVDPlayer() {
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

    public void play(String filmName) {
        this.film = filmName;
    }

    public String getFilm() {
        return film;
    }
}
