package com.example.androiddesignpattern.factorypattern.simplefactorypattern;

/**
 * @author jere
 */
public class UnknownFood implements Food {
    private String mMenuName;

    @Override
    public String get() {
        return "without " + mMenuName;
    }

    public UnknownFood(String menuName) {
     this.mMenuName = menuName;
    }
}
