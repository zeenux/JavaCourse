
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class CreateNewFile
{
    public static void main(String[] args) //throws IOException
    {
      //  createFileUsingFileClass();
      try{
          createFileUsingFileOutputStreamClass();
      }
      catch(IOException ie){
        System.out.println("Gharib tabah de");
      }


    //createFileIn_NIO();
    }

    private static void createFileUsingFileClass() throws IOException
    {
          File file = new File("d:\\java\\HelloWorld.txt");

          //Create the file
          if (file.createNewFile()){
            System.out.println("File is created!");
          }else{
            System.out.println("File already exists.");
          }

          //Write Content
          FileWriter writer = new FileWriter(file);
          writer.write("I am writing this data to Test if i can write toa  file using java");
          writer.close();
    }

    private static void createFileUsingFileOutputStreamClass() throws IOException
    {
        String data = "Test data";
        FileOutputStream out = new FileOutputStream("d://java//createFileUsingFileOutputStream.txt");
        out.write(data.getBytes());
        out.close();
    }

    private static void createFileIn_NIO()  throws IOException
    {
        String data = "Test data";
        Files.write(Paths.get("d://java//testFile3.txt"), data.getBytes());

        //or

        List<String> lines = Arrays.asList("1st line", "2nd line");

        Files.write(Paths.get("file6.txt"), lines, StandardCharsets.UTF_8,StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
    }
}
