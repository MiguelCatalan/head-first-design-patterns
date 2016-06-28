package info.miguelcatalan.headfirst.designpatterns.decorator.coffees;

import info.miguelcatalan.headfirst.designpatterns.decorator.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast";
    }

    public double cost() {
        return .99;
    }
}
