package decorator.example1;


import decorator.example1.base.Beverage;
import decorator.example1.impl.DarkRoast;
import decorator.example1.impl.Espresso;
import decorator.example1.impl.HouseBlend;
import decorator.example1.impl.dec.Mocha;
import decorator.example1.impl.dec.Soy;
import decorator.example1.impl.dec.Whip;

public class StarbuzzCoffeeApp1 {
    public static void main(String[] args) {


        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
                + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);

        System.out.println(beverage2.getDescription()
                + " $" + beverage2.cost());


        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription()
                + " $" + beverage3.cost());

    }

}
