package client;

import flyBehaviour.FlyBehaviour;
import quackBehaviour.QuackBehaviour;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    abstract public void display();

    public void setFlyBehaviour(FlyBehaviour fb){
        flyBehaviour = fb;
    }

    public void setQuackBehaviour(QuackBehaviour qb){
        quackBehaviour = qb;
    }

    public void performFly(){
        flyBehaviour.fly();
    }
    public void performQuack(){
        quackBehaviour.quack();
    }
}
