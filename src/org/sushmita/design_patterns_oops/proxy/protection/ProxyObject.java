package org.sushmita.design_patterns_oops.proxy.protection;

public class ProxyObject implements IObject{
    private ConcreteObject object;

    public ProxyObject(ConcreteObject object){
        this.object = object;
    }
    @Override
    public void sendMessage(String text) {
        //
        System.out.println("User is authenticated!");
        object.sendMessage(text);
    }
}
