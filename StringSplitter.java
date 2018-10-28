import java.io.*;
import java.nio.file.*;
class StringSplitter{
public static String[] fileContents;
public static String delimiter=" ";
public static final String FILE_NAME="prideAndPrejudice.txt";
public static void main(String[] args) throws Exception {

  try{
    readFileNew();
    printFileInfo();
    //fileReaderExample();
  }
  catch(Exception ex){
    System.out.println(ex.toString());
  }
}
public static void fileReaderExample() throws Exception{
  Reader reader=new FileReader(FILE_NAME);

  int data=reader.read();
  while(data!=-1){
    char dataChar=(char) data;
    data=reader.read();
    System.out.print(dataChar);
  }
}
public static void readFile() throws Exception{
  InputStream is = new FileInputStream(FILE_NAME);
  BufferedReader buf = new BufferedReader(new InputStreamReader(is));
  String line = buf.readLine();
  StringBuilder sb = new StringBuilder();
  while(line != null){
    sb.append(line).append("\n");
    line = buf.readLine();
}
String fileAsString = sb.toString();
System.out.println("Contents : " + fileAsString);


}

public static void readFileNew() throws Exception{
  String contents = new String(Files.readAllBytes(Paths.get(FILE_NAME)));
  //System.out.println( contents);
  fileContents=contents.split(delimiter);
  System.out.println(fileContents.length);
  System.out.println(fileContents[0]);

}
public static void printFileInfo(){
  File f=new File(FILE_NAME);
  System.out.println("Absolute Path: "+f.getAbsolutePath());
}
}
