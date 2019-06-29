package com.example.androiddesignpattern.factorypattern.simplefactorypattern;

/**
 * @author jere
 */
public class FoodFactory {
    public static Food getFoodByMenu(String menuName) {
        if (menuName == null) {
            return null;
        }
        if (menuName.equalsIgnoreCase("Pork")) {
            return new Pork();
        } else if (menuName.equalsIgnoreCase("Fish")) {
            return new Fish();
        }
        return new UnknownFood();
    }
}
