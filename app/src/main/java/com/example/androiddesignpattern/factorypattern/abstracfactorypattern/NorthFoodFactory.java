package com.example.androiddesignpattern.factorypattern.abstracfactorypattern;

import com.example.androiddesignpattern.factorypattern.simplefactorypattern.Food;

/**
 * @author jere
 */
public class NorthFoodFactory implements SouthNorthFoodFactory {
    @Override
    public Food getPork() {
        return new NorthPork();
    }

    @Override
    public Food getFish() {
        return new NorthFish();
    }
}
