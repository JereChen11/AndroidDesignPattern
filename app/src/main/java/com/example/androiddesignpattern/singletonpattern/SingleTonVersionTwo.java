package com.example.androiddesignpattern.singletonpattern;

/**
 * @author jere
 */
public class SingleTonVersionTwo {
    private static SingleTonVersionTwo ourInstance;

    public static SingleTonVersionTwo getInstance() {
        if (ourInstance == null){
            synchronized (SingleTonVersionTwo.class) {
                if (ourInstance == null) {
                    ourInstance = new SingleTonVersionTwo();
                }
            }
        }
        return ourInstance;
    }

    private SingleTonVersionTwo() {
    }
}
