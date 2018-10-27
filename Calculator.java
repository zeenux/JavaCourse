class Calculator{
//Method Overloading..

//27 October 2018 Lesson
Calculator(){

}
Calculator (int a, int b){
  this.add(a,b);
}

Calculator (double a, double b){
  this.add(a,b);
}
Calculator(int a, int b, int c){

}
  public int add(int a, int b){
    return a+b;
  }
  public int add(int a, int b, int c){
    return a+b;
  }
  public double add(double a, double b){
    return a+b;
  }

  public int subtract(int a, int b){
    return a-b;
  }

  public double subtract(double a, double b){
    return a-b;
  }

  public double divide(int a, int b){
    return a/b;
  }

  public double divide(double a, double b){
    return a/b;
  }

  public int multiply(int a, int b){
    return a*b;
  }

  public double multiply(double a, double b){
    return a*b;
  }
  public static void main(String[] args) {
    Calculator c=new Calculator();
    System.out.println(c.add(10,10));
    System.out.println(c.add(10.2,10.4));

  }
}
