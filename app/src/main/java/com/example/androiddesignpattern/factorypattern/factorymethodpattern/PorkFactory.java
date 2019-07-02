package com.example.androiddesignpattern.factorypattern.factorymethodpattern;

import com.example.androiddesignpattern.factorypattern.simplefactorypattern.Food;
import com.example.androiddesignpattern.factorypattern.simplefactorypattern.Pork;

/**
 * @author jere
 */
public class PorkFactory implements FoodFactory {
    @Override
    public Food getFood() {
        return new Pork();
    }
}
