package com.research.service.factory;

import com.research.service.factory.definition.Notification;
import com.research.service.factory.implementation.Email;
import com.research.service.factory.implementation.Event;
import com.research.service.factory.implementation.SMS;

public class NotificationFactory {

    public static Notification createNotification(String source) {
        switch (source) {
            case "SMS":
                return new SMS();
            case "EMAIL":
                return new Email();
            case "EVENT":
                return new Event();
        }
        return null;
    }

}
