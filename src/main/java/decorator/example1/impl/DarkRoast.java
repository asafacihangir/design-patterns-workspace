package decorator.example1.impl;

import decorator.example1.base.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    public double cost() {
        return .99;
    }
}
