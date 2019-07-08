package com.example.androiddesignpattern.factorypattern.abstracfactorypattern;

import com.example.androiddesignpattern.factorypattern.simplefactorypattern.Food;

/**
 * @author jere
 */
public interface SouthNorthFoodFactory {

    Food getPork();

    Food getFish();
}
