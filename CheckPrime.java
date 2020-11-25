import java.util.Scanner;

class CheckPrime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if( isPrime(n))
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
        sc.close();
    }
    static boolean isPrime(int num){
        for(int i=2;i*i<=num;i++){
            if(num % i == 0)
                return false;
        }
        return true;
    }
}