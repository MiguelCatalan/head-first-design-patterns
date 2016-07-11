package info.miguelcatalan.headfirst.designpatterns.state;

class GumballMachine {

    private final State soldOutState;
    private final State noQuarterState;
    private final State hasAQuarterState;
    private final State soldState;

    private int currentBalls = 0;
    private State currentState;

    GumballMachine(int initialNumberOfBalls) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasAQuarterState = new HasAQuarterState(this);
        soldState = new SoldState(this);
        currentBalls = initialNumberOfBalls;
        if (currentBalls > 0) {
            currentState = noQuarterState;
        } else {
            currentState = soldOutState;
        }
    }

    void insertQuarter() {
        currentState.insertQuarter();
    }

    void turnCrank() {
        currentState.turnCrank();
        currentState.dispense();
    }

    void ejectQuarter() {
        currentState.ejectQuarter();
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot");
        if (currentBalls != 0) {
            currentBalls--;
        }
    }

    void setState(State state) {
        currentState = state;
    }

    int getCurrentBalls() {
        return currentBalls;
    }

    State getCurrentState() {
        return currentState;
    }

    State getSoldOutState() {
        return soldOutState;
    }

    State getNoQuarterState() {
        return noQuarterState;
    }

    State getHasAQuarterState() {
        return hasAQuarterState;
    }

    State getSoldState() {
        return soldState;
    }
}