package client;

import flyBehaviour.FlyWithWings;
import quackBehaviour.Quack;

public class RedHeadDuck extends Duck{
    public  RedHeadDuck(){
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I'm a Red Head Duck");
    }
}
