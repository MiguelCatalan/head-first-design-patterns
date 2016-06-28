package info.miguelcatalan.headfirst.designpatterns.decorator.condiments;

import info.miguelcatalan.headfirst.designpatterns.decorator.Beverage;
import info.miguelcatalan.headfirst.designpatterns.decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {

    private Beverage beverage;

    public Whip(Beverage coffee) {
        beverage = coffee;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        return beverage.cost() + .10;
    }
}
