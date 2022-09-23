package org.sushmita.design_patterns_oops.adapter;

public class Adapter implements ITarget{
    private IAdaptee adaptee;

    public Adapter(IAdaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.request("From Adapter - ");
    }
}
