import java.util.Scanner;

public class FindSqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sqrt = findSqrt(n);
        System.out.println(sqrt);
        sc.close();
    }

    // //METHOD 1: BY USING LINEAR SEARCH
    // // TIME : O(sqrt(N)) , SPACE : O(1)
    // static int findSqrt(int n) {
    // for (int i = 1; i <= n; i++) {
    // if (i * i == n)
    // return i;
    // else if (i * i > n)
    // return i-1; }
    // return -1;
    // }

    //METHOD 2: BY USING Math.sqrt() OR Math.pow()

    static double findSqrtInbult(int n){
        double d=n;
        return Math.sqrt(d);
    }

    // METHOD 2: BY USING BINARY SEARCH
    static int findSqrt(int n) {
        int l = 1, r = n, ans = 0;

        if (n == 0 || n == 1)
            return n;
            
        while (l <= r) {
            int mid = (l + r) / 2;
            //perfect square
            if (mid * mid == n)
                ans = mid;
            // if lies in right
            if (mid * mid < n) {
                l = mid + 1;
                ans = mid;
            } else
                r = mid - 1;
        }
        return ans;
    }

}
