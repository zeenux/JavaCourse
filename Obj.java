class Obj{

  int a; // Instance Variable
  static int count=0; // Static or Class Variable

  public void Obj(int a){
    //System.out.println("Hello I am a Constructor and i am called when an object is created automatically");
    //Obj.count++;
  }
  public static void main(String[] args) {
    Obj a1=new Obj(10);
    Obj a2=new Obj(20);
    Obj a3=new Obj(30);
    Obj a6=new Obj(40);
    Obj a7=new Obj(10);
    Obj a4=a2;

    a1.a=20;
    a2.a=30;
    a3.a=40;
    a4.a=50;

    System.out.println(a1.a); //50

    System.out.println(a2.a);//30
    System.out.println(a3.a);//40
    System.out.println(a4.a);//50
    //System.out.println("Count is " +Obj.count);
  }
}
