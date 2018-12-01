import java.io.*;

import java.util.ArrayList;
import java.util.List;
class ReadCustomer{

public static void main(String[] args) throws IOException {

  String filename="d:/java/BankProject/accountsinfo/zee.txt";
  FileReader fileReader = new FileReader(filename);

          BufferedReader bufferedReader = new BufferedReader(fileReader);
          List<String> lines = new ArrayList<String>();
          String line = null;

          while ((line = bufferedReader.readLine()) != null)
          {
              lines.add(line);
          }

          bufferedReader.close();

          System.out.println( lines.toArray(new String[lines.size()]));
      }

  }
