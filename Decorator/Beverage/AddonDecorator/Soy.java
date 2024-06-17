package Beverage.AddonDecorator;

import Beverage.Beverage;

public class Soy extends AddonDecorator{
    // For add behaviour at run time it need object of Beverage
    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + 15;
    }
}
