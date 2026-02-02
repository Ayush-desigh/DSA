class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListMergeSort {

    // Merge Sort
    public Node mergeSort(Node head) {
        if (head == null || head.next == null) return head;

        Node mid = findMiddle(head);
        Node rightHead = mid.next;
        mid.next = null;

        Node left = mergeSort(head);
        Node right = mergeSort(rightHead);

        return merge(left, right);
    }

    // Find middle using slow-fast pointer
    public Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Merge two sorted lists
    public Node merge(Node head1, Node head2) {
        Node dummy = new Node(-1);
        Node temp = dummy;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }

        if (head1 != null) temp.next = head1;
        if (head2 != null) temp.next = head2;

        return dummy.next;
    }

    // Helper to print list
    public void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " → ");
            head = head.next;
        }
        System.out.println("null");
    }
     

    // Main method to test
    public static void main(String[] args) {
        LinkedListMergeSort ll = new LinkedListMergeSort();

        Node head = new Node(5);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(2);

        System.out.println("Original List:");
        ll.printList(head);

        head = ll.mergeSort(head);

        System.out.println("Sorted List:");
        ll.printList(head);
    }
}