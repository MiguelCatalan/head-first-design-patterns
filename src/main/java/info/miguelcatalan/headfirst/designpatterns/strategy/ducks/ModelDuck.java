package info.miguelcatalan.headfirst.designpatterns.strategy.ducks;

import info.miguelcatalan.headfirst.designpatterns.strategy.Duck;
import info.miguelcatalan.headfirst.designpatterns.strategy.fly.FlayNoWay;
import info.miguelcatalan.headfirst.designpatterns.strategy.quack.MuteQuack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehaviour = new FlayNoWay();
        quackBehaviour = new MuteQuack();
    }

    public String display() {
        return "I'm a Model Duck";
    }
}
