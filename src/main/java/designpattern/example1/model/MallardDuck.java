package designpattern.example1.model;

import designpattern.example1.model.base.Duck;

public class MallardDuck implements Duck {

  public void quack() {
    System.out.println("Quack");
  }

  public void fly() {
    System.out.println("I'm flying");
  }

}
