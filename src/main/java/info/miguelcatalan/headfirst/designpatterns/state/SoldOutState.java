package info.miguelcatalan.headfirst.designpatterns.state;

class SoldOutState implements State {

    SoldOutState(GumballMachine gumballMachine) {
    }

    public void insertQuarter() {
        System.out.println("You can't insert a quarter, the machine is sold out!");
    }

    public void ejectQuarter() {
        System.out.println("You can't eject a quarter, the machine is sold out!");
    }

    public void turnCrank() {
        System.out.println("You turned the crank, but here is no balls");
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
