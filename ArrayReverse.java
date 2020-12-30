import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int n = sc.nextInt();
        int a[]= new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]= sc.nextInt();
        }
        reverseArr(n,a);
        sc.close();
    }
    static void reverseArr(int n, int[] a){
        for (int i = a.length-1; i >= 0; i--) {
            System.out.print(a[i]+" ");
        }
    }
}
