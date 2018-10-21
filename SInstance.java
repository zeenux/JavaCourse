class SInstance{

public static void main(String[] args) {
  SI s=SI.getInstance(10);// new SI(10);
  SI ss=SI.getInstance(20);
  SI sss=SI.getInstance(30);
  System.out.println(s.x);
}
}
