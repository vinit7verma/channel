package com.concept.service.singleton;

class BillPughSingleton {

    private BillPughSingleton() {
    }

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}

public class SingletonTest {
    BillPughSingleton singleton = BillPughSingleton.getInstance();
}
