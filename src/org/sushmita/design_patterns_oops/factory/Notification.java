package org.sushmita.design_patterns_oops.factory;

public interface Notification {
    enum NotificationType{
        SMS, EMAIL, APP;
    }
    public void send(String message);
}
