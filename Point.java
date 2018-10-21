/*package whatever //do not write package name here */

import java.io.*;

class Point {
    private int x,y;
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
	public Point(int x, int y){
	    this.setX(x);
	    this.setY(y);
	}
	public void move(int x, int y){
	    this.x=this.x+x;
	    this.y=this.y+y;
	}
	public String toString(){
	    return "X Axis: "+this.getX()+" Y Axis: "+this.getY();
	}
	public static void main (String[] args) {
    Console c=System.console();
    int X=Integer.parseInt(c.readLine("Enter X Value for Point"));
    int Y=Integer.parseInt(c.readLine("Enter Y Value for Point"));
		Point p=new Point(X,Y);

		System.out.println(p.toString());
    //System.out.println
    while(c.readLine("Do you Want to Move the Point. Enter Y for YES and N for No").equalsIgnoreCase("Y"))
    {


    X=Integer.parseInt(c.readLine("Enter NEW X Value for Point"));
    Y=Integer.parseInt(c.readLine("Enter NEW Y Value for Point"));
    p.move(X,Y);
		System.out.println("After Moving "+p.toString());
  }
  }
}
