
public class SelectionSort {
    public static void main(String[] args) {
        int a[] = { 2, 4, 0, 1, -3, 8, 10,-5};
        int n = a.length;
        for (int i : a) {
            System.out.print(i + " ");
        }

        // Selection sort
        for (int i = 0; i < n - 1; i++) {
            int minIndex=i;
            for (int j = i; j < n ; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex=j;
                }
            }
            int temp=a[i];
            a[i]=a[minIndex];
            a[minIndex]=temp;
        }
        System.out.println();
        System.out.println("Sorted array.......");
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
