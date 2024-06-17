package Beverage.AddonDecorator;

import Beverage.Beverage;

public class Choclate extends AddonDecorator{
    // For add behaviour at run time it need object of Beverage
    public Choclate(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Choclate";
    }

    @Override
    public double cost() {
        return beverage.cost() + 50;
    }
}
