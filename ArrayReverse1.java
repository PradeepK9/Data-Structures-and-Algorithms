import java.util.Scanner;

public class ArrayReverse1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int res[] = new int[n];
        res = reverseArr(0, n - 1, a);
        for (int i = 0; i < res.length; i++) {
            System.out.print(a[i]+" ");
        }
        sc.close();
    }

    static int[] reverseArr(int start, int end, int[] a) {
        int temp;
        if(start>=end)
        return a;
        System.out.println(start+" "+end);
        temp = a[start];
        a[start] = a[end];
        a[end] = temp;

        // recorsive call
        reverseArr(start + 1, end - 1, a);
        return a;
    }

}
