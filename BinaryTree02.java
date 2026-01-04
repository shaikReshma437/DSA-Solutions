class NodeT {
    int data; NodeT left,right;
    NodeT(int d){ data=d; left=null; right=null; }
}
public class TreeTraversal {
    public static void preorder(NodeT root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args){
        NodeT root = new NodeT(1);
        root.left=new NodeT(2); root.right=new NodeT(3);
        preorder(root);
    }
}
