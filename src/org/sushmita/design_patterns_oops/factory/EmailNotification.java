package org.sushmita.design_patterns_oops.factory;

public class EmailNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println("This is Email Notification - " +message);
    }
}
