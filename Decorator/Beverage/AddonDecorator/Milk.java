package Beverage.AddonDecorator;

import Beverage.Beverage;

public class Milk extends AddonDecorator{
    // For add behaviour at run time it need object of Beverage
    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 30;
    }
}
