package org.sushmita.design_patterns_oops.abstract_factory;

public class LinuxTerminal implements Terminal {
    @Override
    public void render() {
        System.out.println("This screen is in Linux style");
    }
}
