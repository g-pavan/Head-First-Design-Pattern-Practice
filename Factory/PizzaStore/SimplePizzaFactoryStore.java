package PizzaStore;

import Pizza.Pizza;
import SimpleFactory.SimplePizzaFactory;

public class SimplePizzaFactoryStore {
    SimplePizzaFactory factory;

    public SimplePizzaFactoryStore(SimplePizzaFactory factory){
        this.factory = factory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
