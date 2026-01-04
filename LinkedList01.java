class Node {
    int data;
    Node next;
    Node(int d) { data = d; next = null; }
}
public class LinkedListInsert {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        System.out.println("Inserted 1->2->3");
    }
}
