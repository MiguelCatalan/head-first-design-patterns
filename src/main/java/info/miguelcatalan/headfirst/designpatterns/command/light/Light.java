package info.miguelcatalan.headfirst.designpatterns.command.light;

public class Light {

    public enum State {
        ON, OFF
    }

    private final String name;
    private State currentState;

    public Light(String name) {
        this.name = name;
        this.currentState = State.OFF;
    }

    public String getName() {
        return name;
    }

    void on() {
        currentState = State.ON;
        System.out.println(name + " light turned on");
    }

    void off() {
        currentState = State.OFF;
        System.out.println(name + " light turned off");
    }

    public State getCurrentState() {
        return currentState;
    }
}
