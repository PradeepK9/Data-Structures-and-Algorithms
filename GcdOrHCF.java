import java.util.Scanner;

class GcdOrHCF {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(findGcd(a, b));
        sc.close();
    }

    // static int findGcd(int a, int b) {
    // int gcd = 0;
    // for (int i = 2; i <= a && i <= b; i++) {
    // if (a % i == 0 && b % i == 0)
    // gcd = i;
    // }
    // return gcd;
    // }

    //Recursive method
    static int findGcd(int a, int b) {

        // if both are -ve
        a = (a < 0) ? -a : a;
        b = (b < 0) ? -b : b;
        
        if (a == 0 || b == 0)
            return a;
        if (a == b)
            return a;
        if (a > b) {
            return findGcd(a - b, b);
        } else {
            return findGcd(a, b - a);
        }
    }
}