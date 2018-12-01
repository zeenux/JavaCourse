class Child extends Parent{


  public String fname, lname;
  public Child(String pFName, String pLName, String fname, String lname){
    super(pFName,pLName);
    this.fname=fname;
    this.lname=lname;

  }

  public Child(){
    super("HAROON","KHAN");
  }
}
