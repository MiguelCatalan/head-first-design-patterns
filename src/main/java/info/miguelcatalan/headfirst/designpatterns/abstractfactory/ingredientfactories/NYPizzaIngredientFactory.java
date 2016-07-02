package info.miguelcatalan.headfirst.designpatterns.abstractfactory.ingredientfactories;


import info.miguelcatalan.headfirst.designpatterns.abstractfactory.ingredients.Cheese;
import info.miguelcatalan.headfirst.designpatterns.abstractfactory.ingredients.Clams;
import info.miguelcatalan.headfirst.designpatterns.abstractfactory.ingredients.Dough;
import info.miguelcatalan.headfirst.designpatterns.abstractfactory.ingredients.FreshClams;
import info.miguelcatalan.headfirst.designpatterns.abstractfactory.ingredients.Garlic;
import info.miguelcatalan.headfirst.designpatterns.abstractfactory.ingredients.MarinaSauce;
import info.miguelcatalan.headfirst.designpatterns.abstractfactory.ingredients.Mushroom;
import info.miguelcatalan.headfirst.designpatterns.abstractfactory.ingredients.Onion;
import info.miguelcatalan.headfirst.designpatterns.abstractfactory.ingredients.Pepperoni;
import info.miguelcatalan.headfirst.designpatterns.abstractfactory.ingredients.RedPepper;
import info.miguelcatalan.headfirst.designpatterns.abstractfactory.ingredients.ReggianoCheese;
import info.miguelcatalan.headfirst.designpatterns.abstractfactory.ingredients.Sauce;
import info.miguelcatalan.headfirst.designpatterns.abstractfactory.ingredients.SlicedPepperoni;
import info.miguelcatalan.headfirst.designpatterns.abstractfactory.ingredients.ThinCrustDough;
import info.miguelcatalan.headfirst.designpatterns.abstractfactory.ingredients.Veggie;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggie[] createVeggies() {
        return new Veggie[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }

    public Pepperoni createPeperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FreshClams();
    }
}
