// Display File Content On Console
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

class DisplayConsole
{
    public static void main(String args[])
    {
        try {
            File file=new File("sample.txt");
            Scanner reader=new Scanner(file);
            String str;
            System.out.println("Contents On THe File : ");
            while(reader.hasNext())
            {
                str=reader.nextLine();
                System.out.println(str);
            }
        } catch (IOException e) {
            System.out.println("error");
        }
    }
}