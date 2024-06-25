package SimpleFactory;

import FactoryMethod.BlrPizzaStore.BlrPizzaStore;
import FactoryMethod.DelhiPizzaStore.DelhiPizzaStore;
import FactoryMethod.HydPizzaStore.HydPizzaStore;
import Pizza.Pizza;
import PizzaStore.SimplePizzaFactoryStore;

public class SimplePizzaFactoryTest {
    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        SimplePizzaFactoryStore simplePizzaFactoryStore = new SimplePizzaFactoryStore(simplePizzaFactory);

        Pizza pizza = simplePizzaFactoryStore.orderPizza("cheese");
        System.out.println("Pavan ordered a " + pizza.getName() + "\n");
    }
}
