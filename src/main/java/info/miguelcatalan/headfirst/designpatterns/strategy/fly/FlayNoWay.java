package info.miguelcatalan.headfirst.designpatterns.strategy.fly;

import info.miguelcatalan.headfirst.designpatterns.strategy.FlyBehaviour;

public class FlayNoWay implements FlyBehaviour {
    public String fly() {
        return "I can't fly :(";
    }
}
