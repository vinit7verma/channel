package com.concept.service.patterns;

import java.io.Serializable;

public class SingletonTest {
    Singleton obj = Singleton.getInstance();
}

class Singleton implements Serializable {

    private Singleton() {
    }

    private static class SingletonHelper {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    protected Object readResolve() {
        return getInstance();
    }
}

enum EnumSingleton {
    INSTANCE;
}