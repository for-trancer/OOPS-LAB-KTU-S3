import java.io.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.NoSuchElementException;

class FrequencyCount
{
    public static void main(String[] args)throws NoSuchElementException {
        int ch=0,lines=0,word=0;
        try 
        {
            File file=new File("sample.txt");
            FileInputStream input=new FileInputStream(file);
            Scanner reader=new Scanner(file);
            String str;
            int i;
            System.out.println("Contents : ");
            while(reader.hasNext())
            {
                lines++;
                str=reader.nextLine();
                for(i=0;i<str.length();i++)
                {
                    if(str.charAt(i)!=' ')
                    {
                        ch++;
                    }
                }

                String words[]=str.split("\\s+");
                word+=words.length;
                System.out.println(str);
            }
            System.out.println("Lines : "+lines);
            System.out.println("Words : "+word);
            System.out.println("Characters : "+ch);

        }
        catch(IOException e)
        {
            System.out.println("Error");
        }
    }
}