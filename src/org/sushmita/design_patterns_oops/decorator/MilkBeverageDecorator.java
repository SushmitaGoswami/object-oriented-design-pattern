package org.sushmita.design_patterns_oops.decorator;

public class MilkBeverageDecorator extends BeverageDecorator {
    public MilkBeverageDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public Double cost() {
        return this.beverage.cost() + 5.0;
    }
}
