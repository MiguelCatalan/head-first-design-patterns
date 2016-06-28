package info.miguelcatalan.headfirst.designpatterns.decorator.coffees;


import info.miguelcatalan.headfirst.designpatterns.decorator.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}
