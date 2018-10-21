class Bank{

  String bankName;



  public static void main(String[] args) {

        String fName=new String("Zeeshan");
        String lName="Hayat";

        System.out.println(fName+" "+lName);
        char [] ch={'A','B','C'};
        String mName=new String(ch);

        Integer x=new Integer(10);  //Wrapper Classes...
        int xy=100;
        String strXy=xy+"";
        String stryYY="200";
        System.out.println(strXy+stryYY);
        String xStr=x.toString();
        System.out.println(xStr);

        String name1="arsalan";
        String name2="ARSALAN";

        if(name1.equals(name2)){   // Case senstive Comparison
          //Case Insensitive equalsIgnoreCase
          System.out.println("They are equal");
        }
        else{
          System.out.println("They are not equal");
        }

        String name="Zulu Khan ZULU ZULU";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase ());
        System.out.println(name.startsWith("Zulu", 0));
        System.out.println(name.indexOf("ZULU"));

        System.out.println("The length of name is "+name.length());
        String cropped=name.substring(10);

        System.out.println(name.substring(7,name.length()-4));
  }


}
