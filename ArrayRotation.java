import java.util.Scanner;

class ArrayRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        rotateArray(n, arr, d);

        sc.close();
    }

    //METHOD 1:
    // // n=7,d=3 arr=[1,2,3,4,5,6,7] time comp=O(n-d), Space comp= O(d) (Space comp
    // is o(d) instead of o(1) bcoz we using an extra array temp[d] which is not
    // given in qn)
    // static void rotateArray(int n, int [] arr,int d){
    // //create temp arr of size d
    // int temp[]= new int[d];

    // //copy first d ele in temp array temp=[1,2,3], O(d)
    // for (int i = 0; i < d; i++) {
    // temp[i] = arr[i];
    // }

    // // shifting each elemt of arr array d index left ,O(n-d)
    // for (int i = 0; i <n-d ; i++) {
    // arr[i]=arr[i+d];
    // }

    // //testing:
    // for (int i = 0; i <n-d ; i++) {
    // System.out.print(arr[i]);
    // }

    // // addind first d ele to shifted arr in the end, O(d)
    // for (int i = 0; i < d; i++) {
    // arr[i+n-d]=temp[i];
    // }

    // System.out.println("\n............");
    // for (int i = 0; i <n; i++) {
    // System.out.print(arr[i]);
    // }

    // // Time Comp = O(d)+O(d)+O(d)= O(n-d)=> O(n), Space comp = O(d) due to an
    // extra array

    // }



    // // METHOD : 2
    // // n=7,d=3 arr=[1,2,3,4,5,6,7] time comp=O(n*d) which is more than above
    // logic,
    // // Space comp= O(1) bcz no extra array
    // static void rotateArray(int n, int arr[], int d) {
    // for (int j = 0; j < d; j++) {

    // // every time hold first ele of array
    // int temp = arr[0];

    // // shift left every ele of the array
    // for (int i = 0; i < n - 1; i++) {
    // arr[i] = arr[i + 1];
    // }

    // // add the holded ele at the last endex
    // arr[n - 1] = temp;
    // }
    // System.out.println("\n............");
    // for (int i = 0; i < n; i++) {
    // System.out.print(arr[i]);
    // }
    // }


    // METHOD : 3  BEST
    // O(N), O(1)
    static void rotateArray(int n, int arr[], int d) {
        reverseArr(arr, 0, d - 1);
        reverseArr(arr, d, n - 1);
        reverseArr(arr, 0, n - 1);

        System.out.println("\n............");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
    }

    static void reverseArr(int a[], int start, int end) {

        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
}