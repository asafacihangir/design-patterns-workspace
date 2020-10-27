package decorator.example1.impl.dec;

import decorator.example1.base.Beverage;
import decorator.example1.base.CondimentDecorator;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    public double cost() {
        return .10 + beverage.cost();
    }
}
