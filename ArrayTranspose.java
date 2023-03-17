import java.util.Scanner;

class Main 
{
    int[][] a=new int[20][20];
    int m,n,i,j;
    void readData()
    {
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter The No. Of Rows And Columns : ");
        m=reader.nextInt();
        n=reader.nextInt();
        System.out.println("Enter The Elements : ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=reader.nextInt();
            }
        }
    }
    void Display()
    {
        System.out.println("Array | Transpose");
        for(j=0;j<n;j++)
        {
            System.out.println("\n");
            for(i=0;i<m;i++)
            {
                System.out.printf(a[i][j]+"\t");
            }
        }
    }
}
class ArrayTranspose
{
    public static void main(String[] args)
    {
        Main x=new Main();
        x.readData();
        x.Display();
    }
}