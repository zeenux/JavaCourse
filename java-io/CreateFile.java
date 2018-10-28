import java.io.*;
class CreateFile{


public static void main(String[] args) {
  try{
    createFileWithFileClass();
  }
  catch(IOException ie){
    System.out.println(ie.toString());
  }
}
  //Create File with java.io.File class

  public static void createFileWithFileClass() throws IOException {
      File file = new File("d://java//testFile1.txt");
      //Create the file
      if (file.createNewFile())
      {
        System.out.println("File is created!");
      }
      else
      {
        System.out.println("File already exists.");
      }

//Write Content
        FileWriter writer = new FileWriter(file);
        writer.write("Test data");
        writer.close();
  }

  //Create file with java.io.FileOutputStream class

  public static void createFileWithOutputStream() throws IOException{
    String data = "Test data";

    FileOutputStream out = new FileOutputStream("c://temp//testFile2.txt");

    out.write(data.getBytes());
    out.close();
  }
}
