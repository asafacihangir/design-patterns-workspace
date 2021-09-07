package designpattern.example1.adapter;

import designpattern.example1.model.base.Duck;
import designpattern.example1.model.base.Turkey;

public class TurkeyAdapter implements Duck {

  private final Turkey turkey;

  public TurkeyAdapter(Turkey turkey) {
    this.turkey = turkey;
  }

  @Override
  public void quack() {
    turkey.gobble();
  }

  @Override
  public void fly() {
    for (int i = 0; i < 5; i++) {
      turkey.fly();
    }
  }
}
