import java.util.Scanner;

public class Searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int index = search(arr, n, x);
        System.out.println("index is :"+index);

        sc.close();
    }

    // // LINEAR SEARCH => Time: O(n) Space: O(i)
    // static int search(int arr[], int n, int x) {
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] == x)
    // return i;
    // }
    // return -1;
    // }

    // BINARY SEARCH (ie Already sorted array)
    // Time : O(log(n)), Space : O(1)
    // arr= 1,2,4,5,7,9,10
    static int search(int a[], int n, int x) {
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int mid = l + r / 2;
            if (a[mid] == x)
                return mid;
            else if (a[mid] < x)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return -1;
    }

}
