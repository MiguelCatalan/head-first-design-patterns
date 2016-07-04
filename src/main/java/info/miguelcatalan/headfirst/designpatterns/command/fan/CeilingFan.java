package info.miguelcatalan.headfirst.designpatterns.command.fan;

public class CeilingFan {

    public enum State {
        OFF, LOW, MEDIUM, HIGH
    }

    private String name;
    private State currentState;

    public CeilingFan(String name) {
        this.name = name;
        this.currentState = State.OFF;
    }

    public State getCurrentState() {
        return currentState;
    }

    void high() {
        currentState = State.HIGH;
        System.out.println(name + " fan is set to high speed");
    }

    void medium() {
        currentState = State.MEDIUM;
        System.out.println(name + " fan is set to medium speed");
    }

    void low() {
        currentState = State.LOW;
        System.out.println(name + " fan is set to low speed");
    }

    void off() {
        currentState = State.OFF;
        System.out.println(name + " fan is turned off");
    }
}
