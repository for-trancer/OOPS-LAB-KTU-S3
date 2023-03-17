import java.io.*;

class ReadFileData
{
    public static void main(String[] args)
    {
        try
        {
        FileInputStream file1=new FileInputStream("C:\\Users\AMAL\projects\java\output.txt");
        int i=0;
        while((i=file1.read())!=-1)
        {
            System.out.println((char)i);
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        file1.close();
    }
}