import java.util.*;
class TestVector{

public static void main(String[] args) {
  Vector<TestObj> v1=new Vector<TestObj>();
  Dictionary<Integer,TestObj> d=new Hashtable<Integer,TestObj>();
  TestObj t1=new TestObj();
  t1.accountID=1001;
  TestObj t2=new TestObj();
  t2.accountID=30001;
  TestObj t3=new TestObj();
  t3.accountID=20001;

  v1.add(t1);
  v1.add(t2);
  v1.add(t3);


  TestObj tt=v1.elementAt(2);
  //System.out.println(tt.h);

  Iterator v1Iterator=v1.iterator();
  while(v1Iterator.hasNext()){
    TestObj t=(TestObj)v1Iterator.next();
    if(t.accountID==20001)
    System.out.println("Found");
    else
    System.out.println("Not Found");
  }
  Vector<Integer> v2=new Vector<Integer>();
  for(int i=0;i<100;i++){
    Integer x=new Integer(i*20);
    v2.add(new Integer(x));
  }


}
}
