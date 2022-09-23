package org.sushmita.design_patterns_oops.factory;

public class AppNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println("This is App Notification - " +message);
    }
}
