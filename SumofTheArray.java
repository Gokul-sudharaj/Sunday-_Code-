
// Write a Java program to add two matrices of the same dimensions and display the resulting matrix.

// Matrix addition is performed by adding corresponding elements of the two matrices.

// 📥 Input
// First line: Two integers r and c (number of rows and columns)
// Next r lines: Elements of matrix A
// Next r lines: Elements of matrix B
// 📤 Output
// Print the resulting matrix after addition
// 🧪 Example
// Input
// 2 2
// 1 2
// 3 4
// 5 6
// 7 8
// Output
// 6 8
// 10 12

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row Size");
        int r = sc.nextInt();
        System.out.println("Enter the column size");
        int c = sc.nextInt();
        int[][] result = new int[r][c];
        System.out.println("Enter array 1");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter array 2");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] += sc.nextInt();
            }
        }
        System.out.println("Sum of The Array:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
