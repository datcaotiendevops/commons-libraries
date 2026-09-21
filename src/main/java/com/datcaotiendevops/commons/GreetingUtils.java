package com.datcaotiendevops.commons;

public final class GreetingUtils {

    private GreetingUtils() {
    }

    public static String greeting(String name) {
        return "Hello " + name + " from commons-libraries!";
    }
}