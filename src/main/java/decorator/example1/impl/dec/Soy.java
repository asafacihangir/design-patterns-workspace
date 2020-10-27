package decorator.example1.impl.dec;

import decorator.example1.base.Beverage;
import decorator.example1.base.CondimentDecorator;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        return .15 + beverage.cost();
    }
}