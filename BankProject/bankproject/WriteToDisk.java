
package bankproject;
import java.util.*;
import java.io.*;
class WriteToDisk{

  public boolean writeList(String path,ArrayList<Customer> cst){
    //Customer [] cstArray=cst.toArray(new Integer[cst.size()]);

    Iterator<Customer> it=cst.iterator();
    while(it.hasNext()){
      Customer cc=it.next();
      String data=prep(cc);
      String filename=path+"/"+cc.getAccountID()+".xml";
      System.out.println("Writing Data to Disk");

      try{
        Writer fileWriter=new FileWriter(filename);
            fileWriter.write(data);
            fileWriter.close();
      }
      catch(IOException ie){
        System.out.println(ie.toString());
      }
    }
    return true;
  }
  public boolean write(String path,Vector<Customer> cst){
    //Customer [] cstArray=cst.toArray(new Integer[cst.size()]);
    Vector v1=cst;
    Iterator<Customer> it=v1.iterator();
    while(it.hasNext()){
      Customer cc=it.next();
      String data=prep(cc);
      String filename=path+"/"+cc.getAccountID()+".xml";

      try{
        Writer fileWriter=new FileWriter(filename);
            fileWriter.write(data);
      }
      catch(IOException ie){
        System.out.println(ie.toString());
      }
    }
    return true;
  }

  public String prep(Customer c){
    //String data=" <?xml-stylesheet type='text/css' href='style.css'?>";
    String data="<ROOT><FIRST_NAME> "+c.getFname()+"</FIRST_NAME> <LAST_NAME> "+c.getLname()+"</LAST_NAME> <CNIC> "+c.getCnic()+"</CNIC> <UUID> "+c.getUuid()+"</UUID> <ACCOUNT_ID> "+c.getAccountID()+"</ACCOUNT_ID> <ADDRESS> "+c.getAddress()+"</ADDRESS></ROOT>";
    return data;
  }

}
