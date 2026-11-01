public class LinkedList {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Instance variables instead of static
    private static Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public int remove()
        {

            
            int val=head.data;
            head=head.next;
            size--;
            return val;
            
    }

    // Print list for debugging
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void add(int index,int data)
    {
        Node newNode=new Node(data);
        int i=0;
        Node temp=head;
        while(i<index-1)
        {
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        size++;
    }

    public int iteSearch(int key)
    {
        Node temp=head;
        int i=0;
        while(temp!=null)
        {
            if(temp.data==key)
            {
                return i;
                
            }
            temp = temp.next;
            i++;
        }
        return -1; // Not found
    }

    public void reverse()
    {
        Node prev=null;
        Node curr=tail=head;
        Node next;

        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            
        }
        head=prev;
    }

    public void deleteNodeFromEnd(int n)
    { int size=0;
        Node temp=head;

        while(temp!=null)
        {
            temp=temp.next;
            size++;
        }
        if(n==size)
        {
            head=head.next;
            return;
        }
        int i=1;
        int iToNth=size-n;
        Node prev=head;
        while(i<iToNth)
        {
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;


    }
    // from start
    public void deleteNodeFromStart(int n)
    { int size=0;
        Node temp=head;

        while(temp!=null)
        {
            temp=temp.next;
            size++;
        }
        if(n==size)
        {
            head=head.next;
            return;
        }
        int i=1;
        int iToNth=size-n;
        Node prev=head;
        while(i<iToNth)
        {
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;


    }
    // Find Middle of linked LIst



    public boolean checkPalindrome()
    {
        if(head==null || head.next==null)
        {
            return true;
        }

        //step 1-> find mid
            Node midNode=findMiddle(head);
        //step 2-> reverse half linkedlist

        Node prev=null;
        Node curr=midNode;
        Node next;

        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;

        while(right!=null){
            if(left.data!=right.data)
            {
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    //  public   void removeCycle(Node head)
    //  {
    //     Node slow =head;
    //     Node fast =head;
    //     boolean cycle=false;


    //     while(fast!=null && fast.next!=null)
    //     {
    //         slow =slow.next;
    //         fast=fast.next.next;

    //         if(slow==fast)
    //         {
    //             cycle=true;
    //             break;
    //         }

    //     }
    //     if(cycle==false)
    //     {
    //         return;
    //     }
    //     slow =head;
    //     Node prev=null;

    //     while(slow!=fast)
    //     {
    //         prev=fast;
    //         slow=slow.next;
    //         fast=fast.next;
    //     }
    //       prev.next=null;
          

    //  }
    public static boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
    public static void removeCycle(Node head) {
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (!cycle) {
            return;
        }
        slow = head;
        Node prev = null;

        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
    }

    
   public Node findMiddle(Node head) {
    Node slow = head;
    Node fast = head.next;

    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow;
}
    
    //===============================================find nth Node===========================
    
    public int  findNthNode(Node head,int n)
    {
    	
    	Node temp=head;
    	int i=0;
    	 while (temp != null && i < n) {
    	        temp = temp.next;
    	        i++;
    	    }
    	return temp.data;
    	
    }
    
    

    public Node merge(Node head1,Node head2)
    {
        Node mergeLL=new Node(-1);
        Node temp=mergeLL;


        while(head1 != null && head2 !=null)
        {
            if(head1.data <= head2.data)
            {
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else
            {
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }

        while(head1!=null)
        {
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }

        while(head2!=null)
        {
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergeLL.next;


    }
    public Node mergeSort(Node head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }

        Node mid=findMiddle(head);
        Node rightHead=mid.next;
        mid.next=null;
        Node newLeft= mergeSort(head);
        Node newRight=mergeSort(rightHead);

        return merge(newLeft,newRight);
    }
//=============================delete nth node from end of list=============================//
    
    public Node removeNthFromEnd(Node head, int n) {


        Node temp=head;
        int size=0;

        while(temp!=null)
        {
            temp=temp.next;
            size++;
        }
        if(n==size)
        {
            return head=head.next;
        }

        int i=1;
        int findSize=size-n;
        Node prev=head;
        while(i<findSize)
        {
            prev=prev.next;
            i++;
        }

        prev.next=prev.next.next;
        return head;
        
    }
    //========================================================
    public Node rotateRight(Node head,int k)
    {

          if (head == null || head.next == null || k == 0) {
        return head;
    }

      
        int i=0;
        while(i<k)
        {
            Node prev=null;
              Node temp=head;
            while(temp.next!=null)
            {
                prev=temp;
                temp=temp.next;
            }
            temp.next=head;
            head=temp;
            prev.next=null;
            i++;
        }
        return head;
    }


    public static void main(String[] args) {
    //   LinkedList list = new LinkedList();
    //   list.addFirst(2);
    //   list.addLast(0);
    //   list.addFirst(2);
    //   list.addFirst(1);
    //  // list.add(2, 1); // Adding 1 at index 2
    //   list.printList(); 
    // // list.remove();
    //  list.printList();
     
    //  list.printList();
    //  System.out.println(list.checkPalindrome());
    // head=new Node(1);
    // Node temp=new Node(2);
    // head.next=temp;
    // // head.next=new Node(2);

    // head.next.next=new Node(3);
   
    // head.next.next.next=temp;
    // // System.out.println(hasCycle(head));
    // System.out.println(hasCycle(head));
    // removeCycle(head);
    // System.out.println(hasCycle(head));

    LinkedList ll=new LinkedList();
    ll.addFirst(1);
    ll.addFirst(2);
    ll.addFirst(3);
    ll.addFirst(4);
    ll.addFirst(5);
    ll.printList();
    System.out.println("Nth node is"+ll.findNthNode(head, 3));
    ll.head=ll.mergeSort(ll.head);
    ll.printList();
    
    ll.rotateRight(head, 2);
    ll.printList();


    }
}
/*
public Node rotateRight(Node head, int k) {

    if (head == null || head.next == null || k == 0) {
        return head;
    }

    Node temp = head;
    int len = 1;

    // Find length and last node
    while (temp.next != null) {
        temp = temp.next;
        len++;
    }

    // Avoid unnecessary rotations
    k = k % len;

    if (k == 0) {
        return head;
    }

    // Make the list circular
    temp.next = head;

    // Find the new tail
    int steps = len - k;
    Node newTail = head;

    for (int i = 1; i < steps; i++) {
        newTail = newTail.next;
    }

    // Set new head and break the cycle
    Node newHead = newTail.next;
    newTail.next = null;

    return newHead;
} */