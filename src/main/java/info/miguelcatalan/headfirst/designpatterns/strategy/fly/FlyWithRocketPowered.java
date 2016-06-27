package info.miguelcatalan.headfirst.designpatterns.strategy.fly;

import info.miguelcatalan.headfirst.designpatterns.strategy.FlyBehaviour;

public class FlyWithRocketPowered implements FlyBehaviour {
    public String fly() {
        return "Look at me bitch, I'm flying";
    }
}
