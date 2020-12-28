import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        sc.close();
        int count =0;
        // while(n!=0){
        //     count++;
        //     n/=10;
        // }

        count= (int)Math.log10(n)+1;

        System.out.println("No of digits : "+count);
    }
}
