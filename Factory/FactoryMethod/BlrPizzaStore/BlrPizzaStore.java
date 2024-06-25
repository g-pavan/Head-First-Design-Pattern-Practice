package FactoryMethod.BlrPizzaStore;

import Pizza.BlrPizza.BlrStyleCheesePizza;
import Pizza.BlrPizza.BlrStyleVeggiePizza;
import Pizza.Pizza;
import PizzaStore.PizzaStore;

public class BlrPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese"))
            return new BlrStyleCheesePizza();

        if(type.equals("veggie"))
            return new BlrStyleVeggiePizza();

        return null;
    }
}
