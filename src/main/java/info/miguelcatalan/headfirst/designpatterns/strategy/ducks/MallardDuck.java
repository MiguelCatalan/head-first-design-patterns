package info.miguelcatalan.headfirst.designpatterns.strategy.ducks;

import info.miguelcatalan.headfirst.designpatterns.strategy.Duck;
import info.miguelcatalan.headfirst.designpatterns.strategy.fly.FlyWithWings;
import info.miguelcatalan.headfirst.designpatterns.strategy.quack.Quack;

class MallardDuck extends Duck {

    MallardDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }


    public String display() {
        return "I'm a Mallard duck";
    }
}
