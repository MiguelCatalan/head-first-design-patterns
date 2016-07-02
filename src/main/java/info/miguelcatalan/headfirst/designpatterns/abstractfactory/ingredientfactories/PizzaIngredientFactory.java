package info.miguelcatalan.headfirst.designpatterns.abstractfactory.ingredientfactories;

import info.miguelcatalan.headfirst.designpatterns.abstractfactory.ingredients.Cheese;
import info.miguelcatalan.headfirst.designpatterns.abstractfactory.ingredients.Clams;
import info.miguelcatalan.headfirst.designpatterns.abstractfactory.ingredients.Dough;
import info.miguelcatalan.headfirst.designpatterns.abstractfactory.ingredients.Pepperoni;
import info.miguelcatalan.headfirst.designpatterns.abstractfactory.ingredients.Sauce;
import info.miguelcatalan.headfirst.designpatterns.abstractfactory.ingredients.Veggie;

public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggie[] createVeggies();
    Pepperoni createPeperoni();
    Clams createClam();
}
