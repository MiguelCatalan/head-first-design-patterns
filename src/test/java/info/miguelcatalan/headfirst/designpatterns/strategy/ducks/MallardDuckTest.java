package info.miguelcatalan.headfirst.designpatterns.strategy.ducks;

import info.miguelcatalan.headfirst.designpatterns.strategy.Duck;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MallardDuckTest {

    @Test
    public void duckShouldBeAMallard() {
        Duck mallard = new MallardDuck();

        assertEquals("I'm a Mallard duck", mallard.display());
    }

    @Test
    public void mallardDuckShouldQuack() {
        Duck mallard = new MallardDuck();

        assertEquals("Quack!", mallard.performQuack());
    }

    @Test
    public void mallardDuckShouldFly() {
        Duck mallard = new MallardDuck();

        assertEquals("Check out my cool wings while I'm flying", mallard.performFly());
    }
}
