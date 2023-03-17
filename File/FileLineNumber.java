// Print Content In Console With Line Number 
import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.io.*;

class FileLineNumber
{
    public static void main(String[] args) {
        try 
        {
        File file=new File("sample.txt");
        Scanner reader=new Scanner(file);
        int i=0;
        String str;
        while(reader.hasNext())
        {
            i++;
            str=reader.nextLine();
            System.out.println(i+": "+str);
        }
       }
    catch(IOException e)
    {
        System.out.println("File Not Found!");
    }
}
}