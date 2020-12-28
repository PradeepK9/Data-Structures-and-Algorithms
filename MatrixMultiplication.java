import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and cols of matrix 1 and matrix2");
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();
        int row2 = sc.nextInt();
        int col2 = sc.nextInt();
         // checking mult compatibility
         if (col1 != row2) {
            System.out.println("Multilication not possible");
        }

        int a[][] = new int[row1][col1];
        int b[][] = new int[row2][col2];

        System.out.println("Enter elements of matrix1 :");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                a[i][j] = sc.nextInt();
            }

        }
        System.out.println("Enter elements of matrix2 :");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        matrixMul(a, row1, col1, b, row2, col2);

        sc.close();
    }

    public static void matrixMul(int a[][], int row1, int col1, int b[][], int row2, int col2) {
        // // checking mult compatibility
        // if (col1 != row2) {
        //     System.out.println("Multilication not possible");
        //     return;
        // }

        int mult[][] = new int[row1][col2];

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col1; k++) {
                    mult[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        System.err.println("=================");
        printMatrix(a, row1, col1);
        System.err.println("=================");
        printMatrix(b, row2, col2);
        System.err.println("=================");
        printMatrix(mult, row1, col2);

    }

    public static void printMatrix(int matrix[][], int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }

    }
}
