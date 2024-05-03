package quackBehaviour;

public class MuteQuack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Not able to Quack!");
    }
}
