import java.util.Scanner;
class car
{
    String car_name;
    String color;
    String engc;
    String hp;
    void getdetails()
    {
        System.out.println("Car Details \n model name :"+car_name+"\n color : "+color+"\n cubic capacity : "+engc+"\n horsepower :"+hp);
        menu();
    }
    void enginestart()
    {
        System.out.println("Car Engine is Starting...!");
        menu();
    }
    void menu()
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Select the Operation : ");
        System.out.println("1)Show Details \n 2)Start Engine \n 3)Stop Engine \n 4)Lock \n 5)Unlock \n 6)Exit");
        int mode=reader.nextInt();
        if(mode==1)
        {
            getdetails();
        }
        else if(mode==2)
        {
            enginestart();
        }
        else if(mode==3)
        {
            enginestop();
        }
        else if(mode==4)
        {
            lock();
        }
        else if(mode==5)
        {
            unlock();
        }
        else if(mode==6)
        {
            System.out.println("Terminating Session...");
        }
        else
        {
            System.out.println("Invalid Mode Selection : ");
            menu();
        }
    }
    void enginestop()
    {
        System.out.println("Car Engine is Shuting Down...");
        menu();
    }
    void lock()
    {
        System.out.println("Car is locked...");
        menu();
    }
    void unlock()
    {
        System.out.println("Car is unlocked");
        menu();
    }
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        car car1=new car();
        String temp;
        System.out.println("| CArHAckv2 |");
        System.out.println("- In Order to Exploit A Car.We Need Some Details");
        System.out.println("-You also need to be within 120 meter radius");
        System.out.println("- Press any key to Continue...");
        temp=reader.nextLine();
        System.out.println("Enter Car Model Name :");
        car1.car_name=reader.nextLine();
        System.out.println("Enter Car Color :");
        car1.color=reader.nextLine();
        System.out.println("Enter Car Cubic Capacity :");
        car1.engc=reader.nextLine();
        System.out.println("Enter Car HP : ");
        car1.hp=reader.nextLine();
        System.out.println("Car Pwned!!!..... \n Press Any Key to Continue");
        temp=reader.nextLine();
        car1.menu();
    }
}