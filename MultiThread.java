import java.io.*;
import java.util.Random;
import java.lang.Thread;

class ThreadSquare extends Thread
{
    int n;
    public ThreadSquare(int x)
    {
        n=x;
    }
    public void run()
    {
        int sq=n*n;
        System.out.println("Square of "+n+" : "+sq);
    }
}

class ThreadCube extends Thread
{
    int n;
    public ThreadCube(int x)
    {
        n=x;
    }
    public void run()
    {
        int cu=n*n*n;
        System.out.println("Cube of The "+n+" : "+cu);
    }
}

class MainThread extends Thread
{
    public void generateThread()
    {
        Random r=new Random();
        int x=r.nextInt(100);
        if(x%2==0)
        {
            ThreadSquare h=new ThreadSquare(x);
            h.start();
        }
        else
        {
            ThreadCube y=new ThreadCube(x);
            y.start();
        }
    }
}

public class MultiThread
{
    public static void main(String[] args) {
        MainThread c=new MainThread();
        c.generateThread();
    }
}