import java.io.*;
class MyInput{

  public static void main(String[] args) {
    Console c=System.console();

    String str=c.readLine("Enter your Name");
    //int x=Integer.parseInt(c.readLine("Enter Your height"));
    System.out.println(str);
    
  }

}
