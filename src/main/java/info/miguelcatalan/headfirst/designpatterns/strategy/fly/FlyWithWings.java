package info.miguelcatalan.headfirst.designpatterns.strategy.fly;

import info.miguelcatalan.headfirst.designpatterns.strategy.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {
    public String fly() {
        return "Check out my cool wings while I'm flying";
    }
}
