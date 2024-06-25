package Pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<String>();

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDough(String dough){
        this.dough = dough;
    }

    public void setSauce(String sauce){
        this.sauce = sauce;
    }

    public void addToppings(String topping){
        this.toppings.add(topping);
    }

    public void prepare(){
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce... ");
        System.out.println("Adding toppings: " );
        for(String topping:toppings){
            System.out.println("  " + topping);
        }
    }

    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }
}
