package info.miguelcatalan.headfirst.designpatterns.abstractfactory.pizzas;

import com.sun.deploy.util.StringUtils;
import info.miguelcatalan.headfirst.designpatterns.abstractfactory.ingredients.Cheese;
import info.miguelcatalan.headfirst.designpatterns.abstractfactory.ingredients.Clams;
import info.miguelcatalan.headfirst.designpatterns.abstractfactory.ingredients.Dough;
import info.miguelcatalan.headfirst.designpatterns.abstractfactory.ingredients.Pepperoni;
import info.miguelcatalan.headfirst.designpatterns.abstractfactory.ingredients.Sauce;
import info.miguelcatalan.headfirst.designpatterns.abstractfactory.ingredients.Veggie;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    Clams clams;
    Sauce sauce;
    Veggie[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Dough dough;

    private String name;

    public abstract void prepare();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredients() {
        List<String> ingredients = new ArrayList<String>();
        if (dough != null) {
            ingredients.add(dough.getName());
        }

        if (sauce != null) {
            ingredients.add(sauce.getName());
        }

        if (cheese != null) {
            ingredients.add(cheese.getName());
        }

        if (pepperoni != null) {
            ingredients.add(pepperoni.getName());
        }

        if (veggies != null) {
            for (Veggie veggie : veggies) {
                ingredients.add(veggie.getName());
            }
        }

        if (clams != null) {
            ingredients.add(clams.getName());
        }

        return StringUtils.join(ingredients, ", ");
    }
}
