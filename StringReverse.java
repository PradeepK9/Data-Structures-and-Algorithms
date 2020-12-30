import java.util.Scanner;

public class StringReverse {

    public static String reverseWord(String str)
    {
        String res="";
        // Reverse the string str
        for(int i=str.length()-1;i>=0;i-- ){
            res+=str.charAt(i);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(reverseWord(str));
        sc.close();
    }
}
    

