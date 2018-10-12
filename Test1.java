class Person{

  String fname;
  String lname;

  double height;
  int weight;


}

class Man{
  int weight;
}
class XYZ{
  
}

class Test1{

  public static void main(String[] args) {
    Person p=new Person();
    p.fname="Ali";
    p.lname="Hasnain";
    p.height=5.6;
    p.weight=78;

    System.out.println("First Name is "+p.fname);
    System.out.println("Last Name is "+p.lname);
    System.out.println("Height is "+p.height);
    System.out.println("Weight is "+p.weight);
  }
}
