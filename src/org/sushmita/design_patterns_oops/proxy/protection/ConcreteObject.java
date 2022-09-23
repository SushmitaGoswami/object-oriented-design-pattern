package org.sushmita.design_patterns_oops.proxy.protection;

public class ConcreteObject implements IObject{
    @Override
    public void sendMessage(String message) {
        System.out.println(message);
    }
}
