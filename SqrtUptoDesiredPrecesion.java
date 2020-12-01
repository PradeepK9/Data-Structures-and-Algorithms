import java.util.Scanner;

public class SqrtUptoDesiredPrecesion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        System.out.println(printSqrt(n, p));
        sc.close();
    }

    static float printSqrt(int n, int p) {

        int start = 0, end = n;
        int mid = 0;
        double ans = 0;

        // for computing integral part 
		// of square root of number 
        while (start <= end) {

            mid = (start + end) / 2;
            if (mid * mid == n) {
                ans = mid;
                break;
            }

            // incrementing start if integral 
			// part lies on right side of the mid 
            if (mid * mid < n) {
                start = mid + 1;
                ans = mid;
              
                // decrementing end if integral part 
			// lies on the left side of the mid 
            } else {
                end = mid - 1;
            }

        }

        // For computing the fractional part 
		// of square root upto given precision
        double incr = 0.1;
        for (int i = 0; i < p; i++) {

            while (ans * ans <= n) {

                ans = ans + incr;
            }

            // loop terminates when ans * ans > number 
            ans = ans - incr;
            incr = incr / 10;
        }

        return (float) ans;
    }
}
