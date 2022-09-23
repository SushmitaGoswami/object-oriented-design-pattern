package org.sushmita.design_patterns_oops.abstract_factory;

public class LinuxButton implements Button{
    @Override
    public void render() {
        System.out.println("This button is in Linux style");
    }
}
