class ExceptionTesting{

  public double divide(int x, int y){
    return x/y;
  }
  public static void main(String[] args) {
    ExceptionTesting et=new ExceptionTesting();
    double output=0.0;
    double r=0;
    int x=10;
    int y=0;
    try{
      r=x/y;
    }
    catch(ArithmeticException ae){
      System.out.println(ae.getMessage());
      y=2;
      r=x/y;


    }
    System.out.println(r);
    System.out.println("Ended the PRogramme");
    try{
        output=et.divide(10,0);
        System.out.println(output);
    }
    catch(ArithmeticException ex){
      System.out.println("Uh!!!! No division by Zero allowed");
      //System.out.println(et.divide(10,2));
    }
  }
}
