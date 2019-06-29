package com.example.androiddesignpattern.factorypattern.simplefactorypattern;

public class UnknownFood implements Food {
    @Override
    public String get() {
        return "without this food!";
    }
}
