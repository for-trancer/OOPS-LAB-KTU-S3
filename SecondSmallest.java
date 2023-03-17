import java.util.Scanner;

class Main 
{
    Scanner reader=new Scanner(System.in);
    int[] arr=new int[20];
    int size,secsmall,small,i;
    void readData()
    {
        System.out.println("Enter The Size : ");
        size=reader.nextInt();
        for(i=0;i<size;i++)
        {
            arr[i]=reader.nextInt();
        }
    }
    void sortElement()
    {
        small=arr[0];
        for(i=0;i<size;i++)
        {
            if(arr[i]<small)
            {
                small=arr[i];
            }
        }
        secsmall=arr[0];
        for(i=0;i<size;i++)
        {
            if(arr[i]<secsmall&&arr[i]!=small)
            {
                secsmall=arr[i];
            }
        }
    }
    void Display()
    {
        System.out.println("Smallest Element : "+small);
        System.out.println("Second Smallest Element : "+secsmall);
    }
}

class SecondSmallest 
{
    public static void main(String[] args)
    {
        Main x=new Main();
        x.readData();
        x.sortElement();
        x.Display();
    }
}