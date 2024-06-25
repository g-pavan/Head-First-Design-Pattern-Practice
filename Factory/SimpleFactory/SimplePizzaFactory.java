package SimpleFactory;
import Pizza.Pizza;
import Pizza.BlrPizza.BlrStyleCheesePizza;
import Pizza.BlrPizza.BlrStyleVeggiePizza;

public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if(type.equals("cheese"))
            pizza = new BlrStyleCheesePizza();

        if(type.equals("veggie"))
            pizza = new BlrStyleVeggiePizza();

        return pizza;
    }
}
