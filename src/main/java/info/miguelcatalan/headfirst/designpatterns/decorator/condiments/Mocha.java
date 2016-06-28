package info.miguelcatalan.headfirst.designpatterns.decorator.condiments;


import info.miguelcatalan.headfirst.designpatterns.decorator.Beverage;
import info.miguelcatalan.headfirst.designpatterns.decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage coffee) {
        beverage = coffee;
    }

    public double cost() {
        return beverage.cost() + .20;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
