package Beverage.AddonDecorator;

import Beverage.Beverage;

// For is-a relation with beverage to match concrete data type that wrapping the objects behaviour at runtime
public abstract class AddonDecorator extends Beverage {
    // For has-a relation with concrete beverages
    Beverage beverage;

    public abstract String getDescription();
}
