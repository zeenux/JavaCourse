import java.util.*;
class CreateStudents{


static String fname, lname;

  public static void main(String[] args) {

    
    Student s=new Student();
    s.fname="IRfan";
    s.lname="Khan";

    Vector<Student> students=new Vector();
    students.addElement(s);
    Student s1=new Student();
    s1.fname="Mister";
    s1.lname="Kumar";
    students.addElement(s1);
    Student s3=new Student();
    s3.fname="Kabir";
    s3.lname="Das";
    students.addElement(s3);
    students.addElement(new Student("Khalid","Jaan"));
    students.addElement(new Student("Uzma","Gilani"));

    System.out.println(students.elementAt(3));
    Student ss=students.elementAt(4);
    System.out.println(ss.fname);
    ss=students.elementAt(3);
    System.out.println(ss.fname);
}
}
