package info.miguelcatalan.headfirst.designpatterns.abstractfactory.stores;

import info.miguelcatalan.headfirst.designpatterns.abstractfactory.PizzaStore;
import info.miguelcatalan.headfirst.designpatterns.abstractfactory.ingredientfactories.ChicagoPizzaIngredientFactory;
import info.miguelcatalan.headfirst.designpatterns.abstractfactory.ingredientfactories.PizzaIngredientFactory;
import info.miguelcatalan.headfirst.designpatterns.abstractfactory.pizzas.CheesePizza;
import info.miguelcatalan.headfirst.designpatterns.abstractfactory.pizzas.Pizza;
import info.miguelcatalan.headfirst.designpatterns.abstractfactory.pizzas.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if ("veggie".equals(type)) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie pizza");
        } else if ("cheese".equals(type)) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese pizza");
        }

        return pizza;
    }
}
