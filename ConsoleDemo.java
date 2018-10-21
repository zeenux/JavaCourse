import java.io.*;
class ConsoleDemo
{
    public static void main(String args[])
    {
        String str;

        //Obtaining a reference to the console.
        Console con = System.console();

        // Checking If there is no console available, then exit.
        if(con == null)
        {
            System.out.print("No console available");
            return;
        }

        // Read a string and then display it.
        str = con.readLine("Enter your name: ");
        String strHeight=con.readLine("Enter your height");
        int sHeight=Integer.parseInt(strHeight);
        con.printf("Here is your name: %s\n", str);

        System.out.println("Your Height is "+sHeight);
    }
}
