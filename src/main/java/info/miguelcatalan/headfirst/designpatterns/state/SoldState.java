package info.miguelcatalan.headfirst.designpatterns.state;

class SoldState implements State {
    private GumballMachine gumballMachine;

    SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("Please wait, we¡re already giving you a gumball");
    }

    public void ejectQuarter() {
        System.out.println("Sorry you already turned the crank");
    }

    public void turnCrank() {
        System.out.println("Turning twice doesn't give you an other ball");
    }

    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCurrentBalls() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Oops, out of gumballs!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
