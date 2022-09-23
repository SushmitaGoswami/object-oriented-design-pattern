package org.sushmita.design_patterns_oops.factory;

public class NotificationFactory {
    public static Notification getNotification(Notification.NotificationType type) {
        switch (type) {
            case SMS:
                return new SMSNotification();
            case EMAIL:
                return new EmailNotification();
            case APP:
                return new AppNotification();
            default:
                throw new IllegalArgumentException("No such Notification type exists");
        }
    }
}
