package bankproject;
class Driver extends Bank{
  public boolean withdraw(){

    return true;
  }

  public boolean deposit(){

    return true;
  }


  public static void main(String[] args) {
    
    Driver d=new Driver();
    d.setBankName("ABL");
    System.out.println(d.getBankName());
  }
}
