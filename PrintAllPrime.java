import java.util.Scanner;

public class PrintAllPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range :");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        for (int i = n1; i <= n2; i++) {
            if(isPrime(i))
                System.out.println(i);
        }
        sc.close();
    }

    static boolean isPrime(int n){
        for (int j = 2; j*j <= n; j++) {
            if(n%j==0)
                return false;
        }
        return true;
    }
}
