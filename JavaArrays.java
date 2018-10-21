class JavaArrays{

public static void main(String[] args) {
  int [] numbers=new int[10];

  Test [] t1=new Test[10];  //Array Declaration

  t1[0]=new Test(); //Object Assignmebnt
  t1[1]=new Test();
  t1[2]=new Test();
  t1[0].setHeight(10);
  for(int i=0;i<numbers.length;i++){
    numbers[i]=i*4;
  }

  for(int i=0;i<numbers.length;i++){
    System.out.println(numbers[i]);
  }


  int [] numbers2={10,20,30,40,50};
  for(int k:numbers2){
    System.out.println(k);
  }

  String [] names={"Java","C++","C#","Php","Python"};
  for(String pName:names){
    System.out.println(pName);
  }
}
}
