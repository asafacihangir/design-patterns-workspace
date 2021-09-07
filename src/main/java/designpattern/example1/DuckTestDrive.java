package designpattern.example1;

import designpattern.example1.adapter.TurkeyAdapter;
import designpattern.example1.model.MallardDuck;
import designpattern.example1.model.WildTurkey;
import designpattern.example1.model.base.Duck;
import designpattern.example1.model.base.Turkey;

public class DuckTestDrive {

  public static void main(String[] args) {

    Duck duck = new MallardDuck();
    Turkey turkey = new WildTurkey();
    Duck turkeyAdapter = new TurkeyAdapter(turkey);

    System.out.println("The Turkey says...");
    turkey.gobble();
    turkey.fly();


    System.out.println("\nThe TurkeyAdapter says...");
    turkeyAdapter.fly();
    turkey.gobble();



  }

}
