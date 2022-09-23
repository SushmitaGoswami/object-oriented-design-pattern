package org.sushmita.design_patterns_oops.decorator;

public class IceBeverageDecorator extends BeverageDecorator {
    public IceBeverageDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public Double cost() {
        return this.beverage.cost() + 1.0;
    }
}
