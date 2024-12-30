package com.concept.service.factory;

import com.concept.service.factory.definition.Notification;

public class TestFactory {
    public static void main(String[] args) {
        Notification n = NotificationFactory.createNotification("EMAIL");
        n.notifyUser();
        Notification n1 = NotificationFactory.createNotification("SMS");
        n1.notifyUser();
        Notification n2 = NotificationFactory.createNotification("EVENT");
        n2.notifyUser();
    }
}
