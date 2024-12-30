package com.concept.service.patterns;

public class FactoryTest {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();
        Notification email = factory.getNotification("EMAIL");
        email.showNotification();
        Notification sms = factory.getNotification("SMS");
        sms.showNotification();
    }
}

interface Notification {
    void showNotification();
}

class EmailNotification implements Notification {
    @Override
    public void showNotification() {
        System.out.println("Got Email");
    }
}

class SMSNotification implements Notification {
    @Override
    public void showNotification() {
        System.out.println("Got SMS");
    }
}

class NotificationFactory {
    public Notification getNotification(String type) {
        if ("EMAIL".equals(type)) {
            return new EmailNotification();
        } else if ("SMS".equals(type)) {
            return new SMSNotification();
        } else {
            return null;
        }
    }
}