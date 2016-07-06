package info.miguelcatalan.headfirst.designpatterns.facade;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomeTheaterTest {

    @Test
    public void shouldStartMovie() {
        HomeTheaterFacade homeTheaterFacade = givenAnyHomeTheaterFacade();
        homeTheaterFacade.watchMovie("Matrix");

        assertEquals(true, homeTheaterFacade.getPopper().isPopping());
        assertEquals(10, homeTheaterFacade.getTheaterLights().getCurrentDim());
        assertEquals(true, homeTheaterFacade.getScreen().isDown());
        assertEquals(true, homeTheaterFacade.getProjector().isOn());
        assertEquals(Projector.Mode.WIDE, homeTheaterFacade.getProjector().getCurrentMode());
        assertEquals(true, homeTheaterFacade.getAmplifier().isOn());
        assertEquals("DVDPlayer", homeTheaterFacade.getAmplifier().getSource());
        assertEquals(true, homeTheaterFacade.getDvdPlayer().isOn());
        assertEquals("Matrix", homeTheaterFacade.getDvdPlayer().getFilm());
    }


    private HomeTheaterFacade givenAnyHomeTheaterFacade() {
        Amplifier amplifier = new Amplifier();
        Tuner tuner = new Tuner();
        DVDPlayer dvdPlayer = new DVDPlayer();
        CDPlayer cdPlayer = new CDPlayer();
        Projector projector = new Projector();
        TheaterLights theaterLights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popper = new PopcornPopper();

        return new HomeTheaterFacade(amplifier, tuner, dvdPlayer, cdPlayer, projector, theaterLights, screen, popper);
    }

    @Test
    public void shouldStopMovie() {
        HomeTheaterFacade homeTheaterFacade = givenAnyHomeTheaterFacade();
        homeTheaterFacade.watchMovie("Matrix");
        homeTheaterFacade.endMovie();

        assertEquals(false, homeTheaterFacade.getPopper().isOn());
        assertEquals(true, homeTheaterFacade.getTheaterLights().isOn());
        assertEquals(false, homeTheaterFacade.getScreen().isDown());
        assertEquals(false, homeTheaterFacade.getProjector().isOn());
        assertEquals(false, homeTheaterFacade.getAmplifier().isOn());
        assertEquals("DVDPlayer", homeTheaterFacade.getAmplifier().getSource());
        assertEquals(false, homeTheaterFacade.getDvdPlayer().isOn());
    }
}
