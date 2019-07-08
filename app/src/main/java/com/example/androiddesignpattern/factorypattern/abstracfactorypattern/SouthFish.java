package com.example.androiddesignpattern.factorypattern.abstracfactorypattern;

import com.example.androiddesignpattern.factorypattern.simplefactorypattern.Fish;

/**
 * @author jere
 */
public class SouthFish extends Fish {
    @Override
    public String get() {
        return "南派酸菜鱼";
    }
}
