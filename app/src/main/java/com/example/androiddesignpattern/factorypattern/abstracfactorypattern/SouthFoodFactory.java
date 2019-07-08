package com.example.androiddesignpattern.factorypattern.abstracfactorypattern;

import com.example.androiddesignpattern.factorypattern.simplefactorypattern.Food;

/**
 * @author jere
 */
public class SouthFoodFactory implements SouthNorthFoodFactory {
    @Override
    public Food getPork() {
        return new SouthPork();
    }

    @Override
    public Food getFish() {
        return new SouthFish();
    }
}
