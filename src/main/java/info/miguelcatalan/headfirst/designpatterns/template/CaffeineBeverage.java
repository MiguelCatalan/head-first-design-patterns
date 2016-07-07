package info.miguelcatalan.headfirst.designpatterns.template;

import java.util.ArrayList;
import java.util.List;

abstract class CaffeineBeverage {

    List<String> steps = new ArrayList<String>();

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void addCondiments();

    private void pourInCup() {
        System.out.println("Pouring into cup");
        steps.add("Pour into cup");
    }

    abstract void brew();

    private void boilWater() {
        System.out.println("Boiling water");
        steps.add("Boil water");
    }

    List<String> getRecipeUsed() {
        return steps;
    }
}
