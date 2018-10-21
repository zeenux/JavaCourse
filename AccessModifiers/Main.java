class Main{

  public static void main(String[] args) {

    Test t=new Test();
    t.setHeight(100);

    int x=t.add(10,20);
    System.out.println("After Adding the Value is "+x);
    if( t.getHeight()!=0)
      System.out.println(t.getHeight());
      else
      System.out.println("Illegal Value of Height");
  }
}
