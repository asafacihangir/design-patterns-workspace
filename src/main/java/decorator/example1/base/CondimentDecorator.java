package decorator.example1.base;

public abstract class CondimentDecorator  extends Beverage{

    public Beverage beverage;

    public abstract String getDescription();
}
