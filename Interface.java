// Interface Hello World Program!
interface myMain
{
    String msg="Hello World!";
    void display();
}

class Interface implements myMain
{
   public void display()
    {
        System.out.println(msg);
    }
    public static void main(String[] args) {
        Interface x=new Interface();
        x.display();
    }
}