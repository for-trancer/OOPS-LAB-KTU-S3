import java.util.Scanner;

class BillMain
{
    Scanner reader=new Scanner(System.in);
    int units,id;
    double billtotal;
    String name;
    static int no=1;

    void readData()
    {
        System.out.println("Consumer No : "+no);
        System.out.println("Enter The Id : ");
        id=reader.nextInt();
        System.out.println("Enter The Name : ");
        name=reader.next();
        System.out.println("Enter The No Of Units Used : ");
        units=reader.nextInt();
        no++;
    }

    void Calculate()
    {
        if(units<100)
        {
            billtotal=(double)units*1.20;
        }
        else if(units<300)
        {
            billtotal=(double)units*1.20+(units-100)*2;
        }
        else if(units>300)
        {
            billtotal=(double)units*1.20+units*2+(units-300)*3;
        }
    }

    void DisplayData()
    {
        Calculate();
        System.out.println("Id : "+id);
        System.out.println("Name : "+name);
        System.out.println("Units Used : "+units);
        System.out.println("Total Payout : "+billtotal);
    }
}

class ElectricityBill
{
    public static void main(String args[])
    {
        Scanner reader=new Scanner(System.in);
        int i,n;
        System.out.println("Enter The Size : ");
        n=reader.nextInt();
        BillMain[] arr=new BillMain[n];
        for(i=0;i<n;i++)
        {
            arr[i]=new BillMain();
        }
        System.out.println("Enter The Details : ");00
        for(i=0;i<n;i++)
        {
            arr[i].readData();
        }
        System.out.println("Checkout : ");
        for(i=0;i<n;i++)
        {
            arr[i].DisplayData();
        }
    }
}