package com.concept.service.factory.implementation;

import com.concept.service.factory.definition.Notification;

public class Event implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("User Notified using the Events.");
    }
}
