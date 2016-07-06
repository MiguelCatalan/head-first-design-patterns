package info.miguelcatalan.headfirst.designpatterns.facade;

interface Playable {
    void on();

    void off();

    boolean isOn();

    void play(String resource);
}
