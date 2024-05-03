package client;

import flyBehaviour.FlyWithWings;
import quackBehaviour.MuteQuack;

public class DecoyDuck extends Duck{
    public  DecoyDuck(){
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new MuteQuack();
    }
    @Override
    public void display() {
        System.out.println("I'm a Decoy Duck");
    }
}
