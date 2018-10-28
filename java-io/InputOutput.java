import java.io.*;
class InputOutput{

public static void main(String [] args) throws IOException{

  FileInputStream fis=new FileInputStream("abc.txt");
  int c;
  while((c=fis.read())!=-1){
    System.out.print((char)c);
  }

}
}
