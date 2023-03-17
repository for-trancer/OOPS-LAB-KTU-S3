import java.util.*;
import java.io.*;
import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SumOfIntegers
{
    public static void main(String[] args)throws IOException {
        File in=new File("int.txt");
        Scanner r=new Scanner(in);
        String str=r.nextLine();
        int sum=0;
        StringTokenizer st=new StringTokenizer(str," ");
        while(st.hasMoreTokens())
        {
            int n = Integer.parseInt(st.nextToken());
            sum=sum+n;
        }
        System.out.println("Sum : "+sum);
        }
}