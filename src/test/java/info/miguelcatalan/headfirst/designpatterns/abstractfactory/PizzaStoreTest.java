package info.miguelcatalan.headfirst.designpatterns.abstractfactory;

import info.miguelcatalan.headfirst.designpatterns.abstractfactory.stores.ChicagoPizzaStore;
import info.miguelcatalan.headfirst.designpatterns.abstractfactory.pizzas.Pizza;
import info.miguelcatalan.headfirst.designpatterns.abstractfactory.stores.NYPizzaStore;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertEquals;

public class PizzaStoreTest {

    @Test
    public void shouldOrderANYStyleVeggiePizza() {
        PizzaStore nyPizzaStore = new NYPizzaStore();

        Pizza nyStyleVeggiePizza = nyPizzaStore.orderPizza("veggie");

        assertEquals("NY Style Veggie pizza", nyStyleVeggiePizza.getName());
    }

    @Test
    public void shouldANYStyleVeggiePizzaContainsTheRightIngredients() {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza nyStyleVeggiePizza = nyPizzaStore.orderPizza("veggie");

        Assert.assertThat(nyStyleVeggiePizza.getIngredients(), CoreMatchers.allOf(
                containsString("ThinCrustDough"),
                containsString("ReggianoCheese"),
                containsString("Garlic"),
                containsString("Mushroom"),
                containsString("RedPepper"),
                containsString("Onion")));
    }

    @Test
    public void shouldOrderAChicagoStyleVeggiePizza() {
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza chicagoStyleVeggiePizza = chicagoPizzaStore.orderPizza("veggie");

        assertEquals("Chicago Style Veggie pizza", chicagoStyleVeggiePizza.getName());
    }

    @Test
    public void shouldAChicagoStyleVeggiePizzaContainsTheRightIngredients() {
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza chicagoStyleVeggiePizza = chicagoPizzaStore.orderPizza("veggie");

        Assert.assertThat(chicagoStyleVeggiePizza.getIngredients(), CoreMatchers.allOf(
                containsString("ThickCrustDough"),
                containsString("MozzarellaCheese"),
                containsString("Garlic"),
                containsString("Mushroom"),
                containsString("RedPepper"),
                containsString("Onion")));
    }

}
