package org.sushmita.design_patterns_oops.factory;

public class SMSNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println("This is SMS Notification - " +message);
    }
}
