package bankproject;

class ListCustomers{

  public ListCustomers(){

    }

    public static void printCustomers(ArrayList<Customer>customerArrayList){
      Iterator it=customer.iterator();

      while(it.hasNext()){
        Customer cc=(Customer)it.next();
        System.out.println("Account NO: "+cc.getAccountID()+"\t Full Name: "+cc.getFname()+" "+cc.getLname());


      }
    }
  }
