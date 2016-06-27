package info.miguelcatalan.headfirst.designpatterns.strategy.quack;

import info.miguelcatalan.headfirst.designpatterns.strategy.QuackBehaviour;

public class QuackWithHorn implements QuackBehaviour {
    public String quack() {
        return "Leeroy jenkins!";
    }
}
