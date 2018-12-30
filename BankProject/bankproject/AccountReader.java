package bankproject;
import java.util.*;
import java.io.*;
import java.nio.file.*;
class AccountReader{

final static String FILE_NAME="d:/data/countries.csv";

static List<String>countries=new ArrayList<String>();
  public static void main(String [] args) throws IOException{


    Path path=Paths.get(FILE_NAME);
    Scanner scanner=new Scanner(path);
    while(scanner.hasNextLine()){
      String line=scanner.nextLine();
      countries.add(line);
      //System.out.println(line);
    }

    Iterator it=countries.iterator();
    while(it.hasNext()){
      System.out.println(it.next());
    }
  }
}
