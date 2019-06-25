package com.example.androiddesignpattern.singletonpattern;

/**
 * @author jere
 */
public class SingleTonVersionOne {
    private static SingleTonVersionOne ourInstance;
    private String mName;

    public static SingleTonVersionOne getInstance() {
        if (ourInstance == null) {
            ourInstance = new SingleTonVersionOne();
        }
        return ourInstance;
    }

    private SingleTonVersionOne() {
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }
}
