package FactoryMethod.HydPizzaStore;

import Pizza.HydPizza.HydStyleCheesePizza;
import Pizza.HydPizza.HydStyleVeggiePizza;
import Pizza.Pizza;
import PizzaStore.PizzaStore;

public class HydPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese"))
            return new HydStyleCheesePizza();

        if(type.equals("veggie"))
            return new HydStyleVeggiePizza();

        return null;
    }
}
