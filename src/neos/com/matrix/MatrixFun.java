package neos.com.matrix;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixFun {
    private int[][] matrix;

    public MatrixFun(int size) {
        matrix = new int[size][size];
    }

    // Phương thức init để nhập dữ liệu cho mảng matrix
    public void init() {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Nhập các phần tử cho ma trận:");
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print("Phần tử tại vị trí [" + i + "][" + j + "]: ");
//                matrix[i][j] = scanner.nextInt();
//            }
//        }

        matrix = new int [][] {
                {1, 2, 3, 4, 5, 6, 7, 8},
                {7, 8, 2, 3, 6, 4, 3, 2},
                {8, 9, 3, 2, 4, 3, 4, 9},
                {0, 4, 7, 3, 4, 2, 3, 4},
                {9, 8, 7, 4, 3, 2, 3, 8},
                {8, 7, 3, 4, 3, 3, 2, 3},
                {9, 7, 4, 5, 4, 1, 8, 3},
                {9, 8, 4, 3, 7, 5, 9, 8}
        };
    }

    // Phương thức in matrix
    public void printMatrix() {
        System.out.println("Ma trận:");

        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];
            System.out.println(Arrays.toString(row));
        }
    }

    // tổng đường chéo
    public void tongDuongCheo() {
        int size = matrix.length;
        int tongDuongCheoTrai = 0;
        int tongDuongCheoPhai = 0;

        System.out.println("\nTổng đường chéo");

        for (int i = 0; i < size; i++) {
            tongDuongCheoTrai += matrix[i][i];
            tongDuongCheoPhai += matrix[i][size - 1 - i];
        }

        int tong = tongDuongCheoTrai + tongDuongCheoPhai;

        System.out.println("Tổng của đường chéo trái: " + tongDuongCheoTrai);
        System.out.println("Tổng của đường chéo phải: " + tongDuongCheoPhai);
        System.out.println("Tổng của 2 đường chéo: " + tong);
    }

    // sắp xếp các phần tử của mỗi hàng tăng dần
    public void sapXepHangTangDan() {
        System.out.println("\nSắp xếp hàng tăng dần");

        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];
            Arrays.sort(row);

            System.out.println("Hàng " + (i + 1) + ": " + Arrays.toString(row));
        }
    }
}
