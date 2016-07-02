package info.miguelcatalan.headfirst.designpatterns.abstractfactory.pizzas;

import info.miguelcatalan.headfirst.designpatterns.abstractfactory.ingredientfactories.PizzaIngredientFactory;

public class CheesePizza extends Pizza {

    private PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        dough = ingredientFactory.createDough();
        cheese = ingredientFactory.createCheese();
    }
}
