import java.io.*;
import java.util.*;
import java.io.File;

class IOExcep
{
    public static void main(String[] args) throws IOException {
        try 
        {
            File file=new File("output.txt");
            FileOutputStream out=new FileOutputStream(file);
            FileInputStream in=new FileInputStream("sample.txt");
            int i;
            String str="";
            while((i=in.read())!=-1)
            {
                out.write(i);
                str+=(char)i;
            }
            System.out.println(str);
        }
        catch(IOException e)
        {
            System.out.println("Error!");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error!");
        }
    }
}