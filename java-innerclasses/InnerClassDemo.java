class InnerClassDemo{

  public static void main(String[] args) {
    Outer out=new Outer();
    Outer.Inner inn=out.new Inner();
    System.out.println(inn.getX());
  }
}

class Outer{

  class Inner{
    int x=10;
    public int getX(){
      return x;
    }
  }
}
