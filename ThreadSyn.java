import java.lang.Thread;
import java.io.*;

class ThreadOne extends Thread
{
    synchronized public void run()
    {
        System.out.println("Synchronized");
        int i;
        for(i=0;i<6;i++)
        {
            System.out.println("Thread 1 : "+i);
        }
    }
}

public class ThreadSyn
{
    public static void main(String[] args) {
        ThreadOne x=new ThreadOne();
        x.start();
    }
}