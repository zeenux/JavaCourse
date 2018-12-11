package bankproject;
import java.util.UUID;
import java.util.*;//List;
class MenuBar{

ArrayList<Customer> customer=new ArrayList<Customer>();
  public void generateMenuBar(){
        println("Welcome to Banking System");
        for(int i=0;i<80;i++){
          print("*");
        }
        println("MENU OPTIONS");
        println("\t OPEN AN ACCOUNT [A]");
        println("\t LIST ACCOUNTS [L]");
        println("\t WRITE ACCOUNTS TO DISK [W]");
        println("\t EXIT Application[X]");
        println("Select an Option");
        String input=System.console().readLine();
          if(input.equalsIgnoreCase("A")){
            print("Opening an Account");
            openAccount();
          }
          else if(input.equalsIgnoreCase("X")){
            System.exit(0);
          }
          else if(input.equalsIgnoreCase("W")){
            WriteToDisk wtd=new WriteToDisk();
            String path="d:/data/";
            wtd.writeList(path,customer);
          }
          else if(input.equalsIgnoreCase("L")){
            listAccounts();
          }
          else
            println("Unknown Option encountered. Exiting!!!");
  }
  public  void listAccounts(){

    Iterator it=customer.iterator();

    while(it.hasNext()){
      Customer cc=(Customer)it.next();
      println("Account NO: "+cc.getAccountID()+"\t Full Name: "+cc.getFname()+" "+cc.getLname());


    }
    
          generateMenuBar();
  }
public  void drive(){
    println("Please Fill the Fields");
    openAccount();
}
  public  void openAccount()
  {

      String fname=null;
      String lname=null;
      String cnic=null;
      String address=null;
      String accountID=null;
    do{
        print ("Enter First Name: ");
        fname=System.console().readLine();
    } while(fname!=null && fname.isEmpty());

    do
    {
      print("Last Name: ");
      lname=System.console().readLine();
    } while(lname!=null && lname.isEmpty());
    do
    {
        print("CNIC: ");
        cnic=System.console().readLine();
      } while(cnic!=null && cnic.isEmpty());

      do
      {
          print("Enter Address");
          address=System.console().readLine();
      } while(address!=null && address.isEmpty());
    UUID idOne = UUID.randomUUID();

    do{
        print("Enter Account ID: ");
        accountID=System.console().readLine();
      }
      while(accountID!=null && accountID.isEmpty());

      Customer clist=new Customer(fname,lname,cnic,address,accountID,idOne.toString());
      customer.add(new Customer(fname,lname,cnic,address,accountID,idOne.toString()));

    //println("First Name: "+fname+"\nLast Name: "+lname+"\nCNIC: "+cnic+"\n Unique ID: "+idOne+"\nAddress: "+address+"\nAccount ID: "+accountID);
    println("Press X to exit or press Y to go back");
    String action=System.console().readLine();
      if(action.equalsIgnoreCase("Y"))
          generateMenuBar();
      }

      public static void main(String[] args) {
        new MenuBar().generateMenuBar();
      }
      public void print(String s){
        System.out.print(s);
      }
      public void println(String s){
        System.out.println(s);
      }

}
