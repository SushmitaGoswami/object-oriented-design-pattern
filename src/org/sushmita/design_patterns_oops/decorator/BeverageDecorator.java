package org.sushmita.design_patterns_oops.decorator;

public abstract class BeverageDecorator implements Beverage{
    protected Beverage beverage;
    public BeverageDecorator(Beverage beverage){
        this.beverage = beverage;
    }
}
