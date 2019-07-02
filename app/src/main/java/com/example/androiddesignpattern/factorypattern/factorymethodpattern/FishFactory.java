package com.example.androiddesignpattern.factorypattern.factorymethodpattern;

import com.example.androiddesignpattern.factorypattern.simplefactorypattern.Fish;
import com.example.androiddesignpattern.factorypattern.simplefactorypattern.Food;

/**
 * @author jere
 */
public class FishFactory implements FoodFactory {
    @Override
    public Food getFood() {
        return new Fish();
    }
}
