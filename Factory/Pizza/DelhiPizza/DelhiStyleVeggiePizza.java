package Pizza.DelhiPizza;

import Pizza.Pizza;

public class DelhiStyleVeggiePizza extends Pizza {
    public DelhiStyleVeggiePizza(){
        setName("Delhi Style Veg Pizza");
        setDough("Thick veg Dough");
        setSauce("Soya Sauce");

        addToppings("Apple juice");
        addToppings("Flavoured onion");
    }
}
