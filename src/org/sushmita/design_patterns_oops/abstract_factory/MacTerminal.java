package org.sushmita.design_patterns_oops.abstract_factory;

public class MacTerminal implements Terminal{
    @Override
    public void render() {
        System.out.println("This screen is in MacOS style");
    }
}
