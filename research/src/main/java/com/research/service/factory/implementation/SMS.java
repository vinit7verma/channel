package com.research.service.factory.implementation;

import com.research.service.factory.definition.Notification;

public class SMS implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("User notified using the SMS");
    }
}
