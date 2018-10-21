class Test{

  private int height;  // NOT GOOD PRACTICE

  //Setter
  public void setHeight(int height){
    if(height < 2)
        System.out.println("Too Small a Height");
    else if (height > 8)
      System.out.println("Is he a Giant????");
      else
    this.height=height;
  }

  //Getter
  public int getHeight(){

    return this.height;
  }

  public int add(int a,int b){
    return a+b;
  }

}
