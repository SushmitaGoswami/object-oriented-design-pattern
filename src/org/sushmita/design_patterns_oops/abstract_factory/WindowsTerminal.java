package org.sushmita.design_patterns_oops.abstract_factory;

public class WindowsTerminal implements Terminal{
    @Override
    public void render() {
        System.out.println("This screen is in Windows style");
    }
}
