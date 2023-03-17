// File : Sum of Integers

class FileSum
{
    public static void main(String[] args) {
        try 
        {
        File file=new File("int.txt");
        int sum=0;
        FileInputStream input=new FileInputStream(file);
        int i;
        while((i=input.read())!=-1)
        {
            sum=sum+i;
        }  
        System.out.println("SUM : "+sum);      
        }
        catch(IOException e)
        {
            System.out.println("File Not Found!");
        }
    }
}