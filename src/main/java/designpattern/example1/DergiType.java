package designpattern.example1;

public enum DergiType {

  INSAN_VE_HAYAT("insan-ve-hayat-dergisi"),
  YEDIKITA("yedikita-dergisi");

  private final String name;


  DergiType(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
