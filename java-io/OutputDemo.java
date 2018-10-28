import java.io.*;

class OutputDemo{

public static void main(String[] args) throws IOException {

  FileInputStream fis=new FileInputStream("abc.txt");
  FileOutputStream fos=new FileOutputStream("bbc.txt");
  String data="This is some Jumbled Data";
  int c;
  while((c=fis.read())!=-1)
  {
    fos.write(c);
  }
  //fos.write(data);
}
}
