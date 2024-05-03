package client;

import flyBehaviour.FlyWithWings;
import quackBehaviour.Quack;

public class MallardDuck extends Duck{

    public MallardDuck(){
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a Mallard Duck");
    }
}
