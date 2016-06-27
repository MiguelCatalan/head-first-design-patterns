package info.miguelcatalan.headfirst.designpatterns.strategy.quack;

import info.miguelcatalan.headfirst.designpatterns.strategy.QuackBehaviour;

public class Quack implements QuackBehaviour {
    public String quack() {
        return "Quack!";
    }
}
