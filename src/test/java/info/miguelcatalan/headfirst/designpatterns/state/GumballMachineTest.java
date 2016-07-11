package info.miguelcatalan.headfirst.designpatterns.state;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

public class GumballMachineTest {
    @Test
    public void shouldBeInNoQuarterAtInitializationIfHasBalls() {
        GumballMachine gumballMachine = new GumballMachine(5);

        assertThat(gumballMachine.getCurrentState(), instanceOf(NoQuarterState.class));
    }

    @Test
    public void shouldBeInSoldOutAtInitializationIfHasBalls() {
        GumballMachine gumballMachine = new GumballMachine(0);

        assertThat(gumballMachine.getCurrentState(), instanceOf(SoldOutState.class));
    }

    @Test
    public void shouldInsertAQuarter() {
        GumballMachine gumballMachine = new GumballMachine(5);

        gumballMachine.insertQuarter();

        assertThat(gumballMachine.getCurrentState(), instanceOf(HasAQuarterState.class));
    }

    @Test
    public void shouldEjectQuarter() {
        GumballMachine gumballMachine = new GumballMachine(1);

        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();

        assertThat(gumballMachine.getCurrentState(), instanceOf(NoQuarterState.class));
    }

    @Test
    public void shouldSoldABallAndReturnToNoQuarterStateIfHasEnoughBalls() {
        GumballMachine gumballMachine = new GumballMachine(5);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        assertThat(gumballMachine.getCurrentBalls(), equalTo(4));
        assertThat(gumballMachine.getCurrentState(), instanceOf(NoQuarterState.class));
    }

    @Test
    public void shouldSoldABallAndReturnToSoldOutStateIfHasNotEnoughBalls() {
        GumballMachine gumballMachine = new GumballMachine(1);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        assertThat(gumballMachine.getCurrentBalls(), equalTo(0));
        assertThat(gumballMachine.getCurrentState(), instanceOf(SoldOutState.class));
    }

}
