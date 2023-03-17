import java.util.Scanner;
import java.io.*;

class Exception
{
    void readFile() throws  IOException
    {
        FileInputStream file=new FileInputStream("sample.txt");
        throw new IOException("File Not Found");
    }
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        try 
        {
            int x=4;
            int y;
            y=x/0;
            System.out.println(y);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Division By Zero Is Not Possible");
        }
        finally
        {
            System.out.println("Will Always Be Executed");
        }
        Exception x=new Exception();
        try
        {
        x.readFile();
        }
        catch(IOException e)
        {
            System.out.println("Er ror");
        }
    }
