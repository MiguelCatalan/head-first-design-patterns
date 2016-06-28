package info.miguelcatalan.headfirst.designpatterns.strategy.ducks;

import info.miguelcatalan.headfirst.designpatterns.strategy.Duck;
import info.miguelcatalan.headfirst.designpatterns.strategy.fly.FlayNoWay;
import info.miguelcatalan.headfirst.designpatterns.strategy.quack.MuteQuack;

class ModelDuck extends Duck {

    ModelDuck() {
        flyBehaviour = new FlayNoWay();
        quackBehaviour = new MuteQuack();
    }

    public String display() {
        return "I'm a Model Duck";
    }
}
