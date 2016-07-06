package info.miguelcatalan.headfirst.designpatterns.facade;

class HomeTheaterFacade {
    private Amplifier amplifier;
    private Tuner tuner;
    private DVDPlayer dvdPlayer;
    private CDPlayer cdPlayer;
    private Projector projector;
    private TheaterLights lights;
    private Screen screen;
    private PopcornPopper popper;

    HomeTheaterFacade(Amplifier amplifier,
                      Tuner tuner,
                      DVDPlayer dvdPlayer,
                      CDPlayer cdPlayer,
                      Projector projector,
                      TheaterLights theaterLights,
                      Screen screen,
                      PopcornPopper popper) {

        this.amplifier = amplifier;
        this.tuner = tuner;
        this.dvdPlayer = dvdPlayer;
        this.cdPlayer = cdPlayer;
        this.projector = projector;
        this.lights = theaterLights;
        this.screen = screen;
        this.popper = popper;
    }

    void watchMovie(String filmName) {
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.setMode(Projector.Mode.WIDE);
        amplifier.on();
        amplifier.setDVD(dvdPlayer);
        amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(filmName);
    }

    void endMovie() {
        popper.off();
        lights.on();
        screen.up();
        amplifier.off();
        projector.off();
        dvdPlayer.off();
    }

    Amplifier getAmplifier() {
        return amplifier;
    }

    Tuner getTuner() {
        return tuner;
    }

    DVDPlayer getDvdPlayer() {
        return dvdPlayer;
    }

    CDPlayer getCdPlayer() {
        return cdPlayer;
    }

    Projector getProjector() {
        return projector;
    }

    TheaterLights getTheaterLights() {
        return lights;
    }

    Screen getScreen() {
        return screen;
    }

    PopcornPopper getPopper() {
        return popper;
    }

}
