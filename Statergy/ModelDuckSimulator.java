import client.Duck;
import client.MallardDuck;
import client.RubberDuck;
import flyBehaviour.FlyRocket;

public class ModelDuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.setFlyBehaviour(new FlyRocket());
        rubberDuck.performFly();
    }
}
