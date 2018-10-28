import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.io.*;
class ReadFileMethods{
  public static void main(String[] args) {

  }

  //Java 8 - Read file line by line - Files.lines(Path path, Charset cs)

private static String readLineByLineJava8(String filePath)
{

  //Advanced Method.. Use after Generics...
    StringBuilder contentBuilder = new StringBuilder();
    try (Stream<String> stream = Files.lines( Paths.get(filePath), StandardCharsets.UTF_8))
    {
        stream.forEach(s -> contentBuilder.append(s).append("\n"));
    }
    catch (IOException e)
    {
        e.printStackTrace();
    }
    return contentBuilder.toString();
}

//Files.readAllBytes(Path path) - Java 7 and above

private static String readAllBytesJava7(String filePath)
{
    String content = "";
    try
    {
        content = new String ( Files.readAllBytes( Paths.get(filePath) ) );
    }
    catch (IOException e)
    {
        e.printStackTrace();
    }
    return content;
}

//Using BufferedReader and FileReader - Below Java 7

private static String usingBufferedReader(String filePath)
{
    StringBuilder contentBuilder = new StringBuilder();
    try (BufferedReader br = new BufferedReader(new FileReader(filePath)))
    {

        String sCurrentLine;
        while ((sCurrentLine = br.readLine()) != null)
        {
            contentBuilder.append(sCurrentLine).append("\n");
        }
    }
    catch (IOException e)
    {
        e.printStackTrace();
    }
    return contentBuilder.toString();
}
}
