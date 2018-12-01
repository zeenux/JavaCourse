class Driver{
  public static void main(String[] args) {
    Child c=new Child("Azam","Khan","Aamir","Khan");

    System.out.println("Parent First Name is "+c.firstName+" And Last Name is "+c.lastName);

    System.out.println("Child First Name is "+c.fname+" And Last Name is "+c.lname);


    Parent p=new Parent("XYZ","DDDD");

    System.out.println(p.firstName + p.lastName);
  }
}
