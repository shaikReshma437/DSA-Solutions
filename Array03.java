public class LargestElement {
    public static void main(String[] args) {
        int[] a={5,2,9,1};
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max) max=a[i];
        }
        System.out.println(max);
    }
}
