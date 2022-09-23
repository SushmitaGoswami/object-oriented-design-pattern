package org.sushmita.design_patterns_oops.abstract_factory;

public class MacButton implements Button{
    @Override
    public void render() {
        System.out.println("This button is in MacOS style");
    }
}
