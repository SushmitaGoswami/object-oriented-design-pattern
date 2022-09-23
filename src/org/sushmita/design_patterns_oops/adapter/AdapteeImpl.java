package org.sushmita.design_patterns_oops.adapter;

public class AdapteeImpl implements IAdaptee{
    @Override
    public void request(String msg) {
        System.out.println("Adaptee's request call! " + msg);
    }
}
