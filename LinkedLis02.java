class NodeDel {
    int data;
    NodeDel next;
    NodeDel(int d) { data = d; next = null; }
}
public class LinkedListDelete {
    public static void main(String[] args) {
        NodeDel head = new NodeDel(1);
        head.next = new NodeDel(2);
        head.next.next = new NodeDel(3);
        head.next = head.next.next; // delete second node
        System.out.println("Deleted second node");
    }
}
