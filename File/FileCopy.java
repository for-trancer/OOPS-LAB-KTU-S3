// File Input And Output
import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

class FileCopy
{
    public static void main(String[] args) {
        try 
        {
        FileInputStream input =new FileInputStream("sample.txt");
        File out=new File("test.txt");
        FileOutputStream o=new FileOutputStream(out);
        int i;
        while((i=input.read())!=-1)
        {
            o.write(i);
        }
        BufferedReader x=new BufferedReader(new FileReader("sample.txt"));
        String str;
        System.out.println("Contents On The File : ");
        while((str=x.readLine())!=null)
        {
            System.out.println(str);
        }
        System.out.println("Contents has Been Sucessfully Copied!");
    }
    catch(IOException e)
    { 
        System.out.println("Error!");
    }
    }
}