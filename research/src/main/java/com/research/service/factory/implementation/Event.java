package com.research.service.factory.implementation;

import com.research.service.factory.definition.Notification;

public class Event implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("User Notified using the Events.");
    }
}
