package decorator.example1.impl;

import decorator.example1.base.Beverage;

public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 0;
    }
}
