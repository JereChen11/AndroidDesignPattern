package com.example.androiddesignpattern.factorypattern.abstracfactorypattern;

import com.example.androiddesignpattern.factorypattern.simplefactorypattern.Pork;

/**
 * @author jere
 */
public class NorthPork extends Pork {
    @Override
    public String get() {
        return "北派红烧肉";
    }
}
