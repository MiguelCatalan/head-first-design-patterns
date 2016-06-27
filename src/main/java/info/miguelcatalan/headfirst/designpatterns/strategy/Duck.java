package info.miguelcatalan.headfirst.designpatterns.strategy;

public abstract class Duck {

    public FlyBehaviour flyBehaviour;
    public QuackBehaviour quackBehaviour;

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public abstract String display();

    public String performFly() {
        return flyBehaviour.fly();
    }

    public String performQuack() {
        return quackBehaviour.quack();
    }

    public String swim() {
        return "Look I'm swimming!";
    }
}
