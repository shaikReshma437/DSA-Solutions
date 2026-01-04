public class StackUsingArray {
    public static void main(String[] args) {
        int[] stack = new int[5];
        int top = -1;
        stack[++top] = 10;
        stack[++top] = 20;
        System.out.println("Top element: "+stack[top]);
        top--; // pop
        System.out.println("New top: "+stack[top]);
    }
}
