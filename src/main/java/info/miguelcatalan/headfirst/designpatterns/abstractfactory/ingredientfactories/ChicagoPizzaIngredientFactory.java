package info.miguelcatalan.headfirst.designpatterns.abstractfactory.ingredientfactories;


import info.miguelcatalan.headfirst.designpatterns.abstractfactory.ingredients.Cheese;
import info.miguelcatalan.headfirst.designpatterns.abstractfactory.ingredients.Clams;
import info.miguelcatalan.headfirst.designpatterns.abstractfactory.ingredients.Dough;
import info.miguelcatalan.headfirst.designpatterns.abstractfactory.ingredients.FrozenClams;
import info.miguelcatalan.headfirst.designpatterns.abstractfactory.ingredients.Garlic;
import info.miguelcatalan.headfirst.designpatterns.abstractfactory.ingredients.MozzarellaCheese;
import info.miguelcatalan.headfirst.designpatterns.abstractfactory.ingredients.Mushroom;
import info.miguelcatalan.headfirst.designpatterns.abstractfactory.ingredients.Onion;
import info.miguelcatalan.headfirst.designpatterns.abstractfactory.ingredients.Pepperoni;
import info.miguelcatalan.headfirst.designpatterns.abstractfactory.ingredients.PepperoniCubes;
import info.miguelcatalan.headfirst.designpatterns.abstractfactory.ingredients.PlumTomatoSauce;
import info.miguelcatalan.headfirst.designpatterns.abstractfactory.ingredients.RedPepper;
import info.miguelcatalan.headfirst.designpatterns.abstractfactory.ingredients.Sauce;
import info.miguelcatalan.headfirst.designpatterns.abstractfactory.ingredients.ThickCrustDough;
import info.miguelcatalan.headfirst.designpatterns.abstractfactory.ingredients.Veggie;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    public Veggie[] createVeggies() {
        return new Veggie[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }

    public Pepperoni createPeperoni() {
        return new PepperoniCubes();
    }

    public Clams createClam() {
        return new FrozenClams();
    }
}
