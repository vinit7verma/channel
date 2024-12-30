package com.concept.service.factory.implementation;

import com.concept.service.factory.definition.Notification;

public class Email implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("User notified using the Email");
    }
}
