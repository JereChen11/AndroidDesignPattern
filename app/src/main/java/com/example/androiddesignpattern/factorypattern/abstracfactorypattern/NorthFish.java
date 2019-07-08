package com.example.androiddesignpattern.factorypattern.abstracfactorypattern;

import com.example.androiddesignpattern.factorypattern.simplefactorypattern.Fish;

/**
 * @author jere
 */
public class NorthFish extends Fish {
    @Override
    public String get() {
        return "北派酸菜鱼";
    }
}
