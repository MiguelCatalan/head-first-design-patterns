package info.miguelcatalan.headfirst.designpatterns.state;

class NoQuarterState implements State {

    private final GumballMachine gumballMachine;

    NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasAQuarterState());
    }

    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    public void turnCrank() {
        System.out.println("You turned, but there is no quarter");
    }

    public void dispense() {
        System.out.println("You need to pay first");
    }
}
