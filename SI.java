class SI{

  int x;

static int countOfObjects=0;
  private SI(int x){
    this.x=x;

  }

  public static SI getInstance(int x){
    System.out.println("New Node Registered on Network Total Nodes are now : "+(++countOfObjects));
    return new SI(x);
  }

  
}
