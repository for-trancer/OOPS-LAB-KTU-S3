import java.util.Scanner;
class MatrixMul
{
  int[][] a=new int[20][20];
  int[][] b=new int[20][20];
  int[][] c=new int[20][20];
  int i,j,k,m,n,p,q;
  void readData()
  {
    Scanner reader=new Scanner(System.in);
    System.out.println("Enter The Number Of Rows And Columns Of Matrix A : ");
    m=reader.nextInt();
    n=reader.nextInt();
    System.out.println("Enter The Number Of Rows And Columns Of Matrix B : ");
    p=reader.nextInt();
    q=reader.nextInt();
    System.out.println("Enter The Elements of Matrix A : ");
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            a[i][j]=reader.nextInt();
        }
    }
    System.out.println("Enter The Elements of Matrix B : ");
    for(i=0;i<p;i++)
    {
        for(j=0;j<q;j++)
        {
            b[i][j]=reader.nextInt();
        }
    }
  }
  void Display()
  {
      System.out.println("Array After Multiplication : ");
      for(i=0;i<p;i++)
      {
          System.out.println("\n");
          for(j=0;j<q;j++)
          {
              System.out.printf(c[i][j]+"\t");
          }
      }
  }
  void multiplyItem()
  {
      if(m==p&&q==n)
      {
          for(i=0;i<p;i++)
          {
              for(j=0;j<q;j++)
              {
              c[i][j]=0;
              for(k=0;k<p;k++)
              {
                  c[i][j]=c[i][j]+a[i][k]*b[k][j];
              }
              }
              Display();
          }
      }
      else 
      {
          System.out.println("Array Multiplication Not Possible!");
      }
  }
}

class MatrixMultiplication
{
  public static void main(String[] args)
  {
    Scanner reader=new Scanner(System.in);
    MatrixMul x=new MatrixMul();
    x.readData();
    x.multiplyItem();
  }
}