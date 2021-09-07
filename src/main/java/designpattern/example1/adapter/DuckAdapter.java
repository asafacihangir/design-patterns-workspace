package designpattern.example1.adapter;

import designpattern.example1.model.base.Duck;
import designpattern.example1.model.base.Turkey;
import java.util.Random;

public class DuckAdapter implements Turkey {

  private final Duck duck;
  private final Random rand;

  public DuckAdapter(Duck duck) {
    this.duck = duck;
    rand = new Random();
  }

  @Override
  public void gobble() {
    duck.quack();
  }

  @Override
  public void fly() {
    if (rand.nextInt(5)  == 0) {
      duck.fly();
    }
  }
}
