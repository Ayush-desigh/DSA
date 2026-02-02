import java.util.*;
public class DoubleyLinkedList
{
    public class Node
    {
        int data;
        Node next=null;
        Node prev=null;

        public Node(int data)
        {
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data)
    {
        Node newNode=new Node(data);

        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
        size++;
    }
    public int removeHead()
    {
        if(head==null)
        {
            System.out.println("Dll is Empty");
            return Integer.MIN_VALUE;
        }
        if(size==1)
        {
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }

        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return  val;
    }

    public void print()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String args[])
    {
        DoubleyLinkedList dll=new DoubleyLinkedList();
        // dll.addFirst(4);
        // dll.addFirst(3);
         dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        System.out.println("Size Of DoublyLinkedList"+dll.size);
        dll.removeHead();
        dll.print();
        System.out.println("Size of DoubleyLinkedList"+dll.size);
    }
}