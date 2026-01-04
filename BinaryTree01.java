class Node {
    int data; Node left,right;
    Node(int d){ data=d; left=null; right=null; }
}
public class BinaryTree {
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        System.out.println("Binary Tree Created");
    }
}
