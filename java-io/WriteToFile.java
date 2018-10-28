import java.io.IOException;
import java.io.*;
import java.nio.channels .*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.*;
class WriteToFile{

  public static void main(String[] args) {
    //Call Every Method here with Try catch block;;
    
  }
//Using BufferedWriter
public static void usingBufferedWritter() throws IOException
{
    String fileContent = "Hello Learner !! Welcome to howtodoinjava.com.";

    BufferedWriter writer = new BufferedWriter(new FileWriter("c:/temp/samplefile1.txt"));
    writer.write(fileContent);
    writer.close();
}
//Using fileWriter
public static void usingFileWriter() throws IOException
{
    String fileContent = "Hello Learner !! Welcome to howtodoinjava.com.";

    FileWriter fileWriter = new FileWriter("c:/temp/samplefile2.txt");
    fileWriter.write(fileContent);
    fileWriter.close();
}
//Using PrintWriter
public static void usingPrintWriter() throws IOException
{
    String fileContent = "Hello Learner !! Welcome to howtodoinjava.com.";

    FileWriter fileWriter = new FileWriter("c:/temp/samplefile3.txt");
    PrintWriter printWriter = new PrintWriter(fileWriter);
    printWriter.print(fileContent);
    printWriter.printf("Blog name is %s", "howtodoinjava.com");
    printWriter.close();
}
//Using FileOutputStream
public static void usingFileOutputStream() throws IOException
{
    String fileContent = "Hello Learner !! Welcome to howtodoinjava.com.";

    FileOutputStream outputStream = new FileOutputStream("c:/temp/samplefile4.txt");
    byte[] strToBytes = fileContent.getBytes();
    outputStream.write(strToBytes);

    outputStream.close();
}
//Using Path
  public static void usingPath() throws IOException
  {
    String fileContent = "Hello Learner !! Welcome to howtodoinjava.com.";

    Path path = Paths.get("c:/temp/samplefile7.txt");

    Files.write(path, fileContent.getBytes());
  }

  //Using FIle Channel
  public static void usingFileChannel() throws IOException
  {
    String fileContent = "Hello Learner !! Welcome to Test.";
    RandomAccessFile stream = new RandomAccessFile("c:/temp/samplefile6.txt", "rw");
    FileChannel channel = stream.getChannel();
    byte[] strBytes = fileContent.getBytes();
    ByteBuffer buffer = ByteBuffer.allocate(strBytes.length);
    buffer.put(strBytes);
    buffer.flip();
    channel.write(buffer);
    stream.close();
    channel.close();
}
//Using DataOutputStream
public static void usingDataOutputStream() throws IOException
{
    String fileContent = "Hello Learner !! Welcome to howtodoinjava.com.";

    FileOutputStream outputStream = new FileOutputStream("c:/temp/samplefile5.txt");
    DataOutputStream dataOutStream = new DataOutputStream(new BufferedOutputStream(outputStream));
    dataOutStream.writeUTF(fileContent);

    dataOutStream.close();
}
}
