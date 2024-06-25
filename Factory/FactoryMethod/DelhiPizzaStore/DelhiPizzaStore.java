package FactoryMethod.DelhiPizzaStore;

import Pizza.DelhiPizza.DelhiStyleCheesePizza;
import Pizza.DelhiPizza.DelhiStyleVeggiePizza;
import Pizza.Pizza;
import PizzaStore.PizzaStore;

public class DelhiPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese"))
            return new DelhiStyleCheesePizza();

        if(type.equals("veggie"))
            return new DelhiStyleVeggiePizza();

        return null;
    }
}
