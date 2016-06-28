package info.miguelcatalan.headfirst.designpatterns.decorator;

import info.miguelcatalan.headfirst.designpatterns.decorator.coffees.DarkRoast;
import info.miguelcatalan.headfirst.designpatterns.decorator.coffees.Espresso;
import info.miguelcatalan.headfirst.designpatterns.decorator.condiments.Mocha;
import info.miguelcatalan.headfirst.designpatterns.decorator.condiments.Whip;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class StarBuzzCoffeeTest {

    @Test
    public void descriptionShouldBeAEspresso() {
        Beverage beverage = new Espresso();

        assertEquals("Espresso", beverage.getDescription());
    }

    @Test
    public void espressoShouldCostTheRightAmount() {
        Beverage beverage = new Espresso();

        assertEquals(1.99, beverage.cost(), 0);
    }

    @Test
    public void shouldOrderADarkRoastDoubleMochaWithWhip() {
        Beverage coffee = new DarkRoast();

        coffee = new Mocha(coffee);
        coffee = new Mocha(coffee);
        coffee = new Whip(coffee);

        assertThat(coffee.getDescription(), containsString("Dark Roast"));
        assertThat(coffee.getDescription(), containsString("Mocha, Mocha"));
        assertThat(coffee.getDescription(), containsString("Whip"));
    }

    @Test
    public void darkRoastDoubleMochaWithWhipShouldCostTheRightAmount() {
        Beverage coffee = new DarkRoast();

        coffee = new Mocha(coffee);
        coffee = new Mocha(coffee);
        coffee = new Whip(coffee);

        assertEquals(coffee.cost(), 1.49, 0);
    }
}
