package com.example.androiddesignpattern.factorypattern.abstracfactorypattern;

import com.example.androiddesignpattern.factorypattern.simplefactorypattern.Pork;

/**
 * @author jere
 */
public class SouthPork extends Pork {
    @Override
    public String get() {
        return "南派红烧肉";
    }
}
