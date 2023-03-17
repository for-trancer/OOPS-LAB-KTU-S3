import java.util.Scanner;

public class LinkedList
{
    static Node head;
    class Node 
    {
        int data;
        Node prev,next;
        public Node(int data)
        {
            this.data=data;
            this.prev=this.next=null;
        }
    }
    public void createNode(int data)
    {
        Node temp=new Node(data);
        if(head==null)
        head=temp;
        else
        {
            Node ptr=head;
            while(ptr.next!=null)
            {
                ptr=ptr.next;
            }
            ptr.next=temp;
            temp.prev=ptr;
        }
    }
    public void deleteNode()
    {
        if(head==null)
        System.out.println("List is empty!");
        else
        {
            int x=head.data;
            Node temp=head;
            head=head.next;
            temp=null;
        }
    }
    public void display()
    {
        if(head==null)
        {
            System.out.println("EMpty!");
        }
        else
        {
            Node ptr=head;
            while(ptr!=null)
            {
                System.out.printf("%d \t",ptr.data);
                ptr=ptr.next;
            }
        }
    }
    public void menu()
    {
        Scanner r=new Scanner(System.in);
        System.out.println("Select The Mode  : 1)Insert 2)Delete 3)Display 4)Exit ");
        int mode=r.nextInt();
        switch(mode)
        {
            case 1:System.out.println("Enter The Data : ");
            int data=r.nextInt();
            createNode(data);
            display();
            menu();
            break;
            case 2:deleteNode();
            display();
            menu();
            break;
            case 3:display();
            menu();
            break;
            case 4:break;
        }
    }
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        head=null;
        list.menu();
    }
}