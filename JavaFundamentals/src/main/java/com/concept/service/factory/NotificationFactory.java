package com.concept.service.factory;

import com.concept.service.factory.definition.Notification;
import com.concept.service.factory.implementation.Email;
import com.concept.service.factory.implementation.Event;
import com.concept.service.factory.implementation.SMS;

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
