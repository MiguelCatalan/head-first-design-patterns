package info.miguelcatalan.headfirst.designpatterns.abstractfactory;

import info.miguelcatalan.headfirst.designpatterns.abstractfactory.pizzas.Pizza;
import info.miguelcatalan.headfirst.designpatterns.abstractfactory.stores.ChicagoPizzaStore;
import info.miguelcatalan.headfirst.designpatterns.abstractfactory.stores.NYPizzaStore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

        List<String> rightIngredients = new ArrayList<String>();
        rightIngredients.add("ThinCrustDough");
        rightIngredients.add("ReggianoCheese");
        rightIngredients.add("Garlic");
        rightIngredients.add("Mushroom");
        rightIngredients.add("RedPepper");
        rightIngredients.add("Onion");

        assertTrue(nyStyleVeggiePizza.getIngredients().containsAll(rightIngredients));
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


        List<String> rightIngredients = new ArrayList<String>();
        rightIngredients.add("ThickCrustDough");
        rightIngredients.add("MozzarellaCheese");
        rightIngredients.add("Garlic");
        rightIngredients.add("Mushroom");
        rightIngredients.add("RedPepper");
        rightIngredients.add("Onion");

        assertTrue(chicagoStyleVeggiePizza.getIngredients().containsAll(rightIngredients));
    }

    @Test
    public void shouldOrderANYStyleCheesePizza() {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza nyStyleCheesePizza = nyPizzaStore.orderPizza("cheese");

        assertEquals("NY Style Cheese pizza", nyStyleCheesePizza.getName());
    }

    @Test
    public void shouldANYStyleCheesePizzaContainsTheRightIngredients() {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza nyStyleCheesePizza = nyPizzaStore.orderPizza("cheese");


        List<String> rightIngredients = new ArrayList<String>();
        rightIngredients.add("ThinCrustDough");
        rightIngredients.add("ReggianoCheese");
        assertTrue(nyStyleCheesePizza.getIngredients().containsAll(rightIngredients));
    }

    @Test
    public void shouldOrderAChicagoStyleCheesePizza() {
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza chicagoStyleCheesePizza = chicagoPizzaStore.orderPizza("cheese");

        assertEquals("Chicago Style Cheese pizza", chicagoStyleCheesePizza.getName());
    }

    @Test
    public void shouldAChicagoStyleCheesePizzaContainsTheRightIngredients() {
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza chicagoStyleCheesePizza = chicagoPizzaStore.orderPizza("cheese");

        List<String> rightIngredients = new ArrayList<String>();
        rightIngredients.add("ThickCrustDough");
        rightIngredients.add("MozzarellaCheese");

        assertTrue(chicagoStyleCheesePizza.getIngredients().containsAll(rightIngredients));
    }

}
