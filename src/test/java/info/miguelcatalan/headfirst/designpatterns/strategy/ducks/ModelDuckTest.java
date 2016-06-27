package info.miguelcatalan.headfirst.designpatterns.strategy.ducks;

import info.miguelcatalan.headfirst.designpatterns.strategy.Duck;
import info.miguelcatalan.headfirst.designpatterns.strategy.fly.FlyWithRocketPowered;
import info.miguelcatalan.headfirst.designpatterns.strategy.quack.QuackWithHorn;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ModelDuckTest {

    @Test
    public void duckShouldBeAModel() {
        Duck model = new ModelDuck();

        assertEquals("I'm a Model Duck", model.display());
    }

    @Test
    public void modelDuckShouldNotQuack() {
        Duck model = new ModelDuck();

        assertEquals("<< Silence >>", model.performQuack());
    }

    @Test
    public void modelDuckShouldNotFly() {
        Duck model = new ModelDuck();

        assertEquals("I can't fly :(", model.performFly());
    }

    @Test
    public void modelDuckShouldFlyWithRocket() {
        Duck model = new ModelDuck();

        model.setFlyBehaviour(new FlyWithRocketPowered());

        assertEquals("Look at me bitch, I'm flying", model.performFly());
    }

    @Test
    public void modelDuckShouldQuackWithHorn() {
        Duck model = new ModelDuck();

        model.setQuackBehaviour(new QuackWithHorn());

        assertEquals("Leeroy jenkins!", model.performQuack());
    }
}
