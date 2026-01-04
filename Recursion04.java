public class ReverseNumber {
    static void rev(int n){
        if(n==0) return;
        System.out.print(n%10);
        rev(n/10);
    }
    public static void main(String[] args) {
        rev(123);
    }
}
