
public class BubbleSort {
    public static void main(String[] args) {
        int a[] = { 2, 4, 0, 1, -3, 8, 10,-5};
        int n = a.length;
        for (int i : a) {
            System.out.print(i + " ");
        }

        // Bubble sort
        for (int i = 0; i < n - 1; i++) {
            boolean sorted = true;
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    sorted= false;
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
            if(sorted){
                break;
            }
        }
        System.out.println();
        System.out.println("Sorted array.......");
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
