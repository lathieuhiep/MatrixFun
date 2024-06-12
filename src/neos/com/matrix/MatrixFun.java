package neos.com.matrix;

import java.util.Arrays;

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

        int[][] newMatrix = new int[matrix.length][];

        for (int i = 0; i < matrix.length; i++) {
            newMatrix[i] = Arrays.copyOf(matrix[i], matrix[i].length);
            Arrays.sort(newMatrix[i]);
            System.out.println(Arrays.toString(newMatrix[i]));
        }
    }

    // sắp xếp các phần tử của cột đầu tiên tăng dần
    public void sapXepCotDauTienTangDan() {
        System.out.println("\nSắp xếp cột đầu tiên tăng dần");

        int rows = matrix.length;
        int[] firstColumn = new int[rows];

        for (int i = 0; i < rows; i++) {
            firstColumn[i] = matrix[i][0];
        }

        Arrays.sort(firstColumn);
        System.out.println(Arrays.toString(firstColumn));
    }

    // sắp xếp các phần tử của đường chéo trái tăng dần
    public void sapXepDuongCheoTraiTangDan() {
        System.out.println("\nSắp xếp đường chéo trái tăng dần");
        int rows = matrix.length;
        int[] diagonalLine = new int[rows];

        for (int i = 0; i < rows; i++) {
            diagonalLine[i] = matrix[i][i];
        }

        Arrays.sort(diagonalLine);
        System.out.println(Arrays.toString(diagonalLine));
    }

    // sắp xếp các phần tử của đường chéo phải tăng dần
    public void sapXepDuongCheoPhaiTangDan() {
        System.out.println("\nSắp xếp đường chéo phải tăng dần");
        int rows = matrix.length;
        int[] diagonalLine = new int[rows];

        for (int i = 0; i < rows; i++) {
            diagonalLine[i] = matrix[i][rows - 1 - i];;
        }

        Arrays.sort(diagonalLine);
        System.out.println(Arrays.toString(diagonalLine));
    }

    // in ra cột có tổng lớn nhất
    public void inRaCotTongLonNhat() {
        System.out.println("\nCột có tổng lớn nhất");

        int[] columnTotals = new int[matrix.length];

        for (int j = 0; j < matrix[0].length; j++) {
            int sumCol = 0;

            for (int i = 0; i < matrix.length; i++) {
                sumCol += matrix[i][j];
            }

            columnTotals[j] = sumCol;
            System.out.println("Tổng cột " + (j + 1) + ": " + sumCol);
        }

        findMax( columnTotals );
    }



    public void findMax(int[] arrInt) {
        int max = arrInt[0];
        int index = 0;

        for (int i = 0; i < arrInt.length; i++) {
            if ( arrInt[i] > max ) {
                max = arrInt[i];
                index = i;
            }
        }

        System.out.println("=> Cột " + (index + 1) + " có tổng lớn nhất là " + max);
    }

    // sắp xếp thứ tự các cột theo chiều tăng dần của tổng các phần tử trên cột đó
    public void sapXepCacCot() {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] columnSums = new int[cols][2];

        System.out.println("\nSắp xếp cột theo chiều tăng dần của tổng các phần tử");

        for (int j = 0; j < cols; j++) {
            int sum = 0;

            for (int i = 0; i < rows; i++) {
                sum += matrix[i][j];
            }

            columnSums[j][0] = sum;
            columnSums[j][1] = j;
        }

        // sắp xếp dãy cột tổng
        System.out.println("Dãy sau khi sắp xếp");

        for (int i = 0; i < columnSums.length; i++) {
            for (int j = i + 1; j < columnSums.length; j++) {

                if (columnSums[i][0] > columnSums[j][0]) {
                    int tmp = columnSums[i][0];
                    columnSums[i][0] = columnSums[j][0];
                    columnSums[j][0] = tmp;

                    int tmpIndex = columnSums[i][1];
                    columnSums[i][1] = columnSums[j][1];
                    columnSums[j][1] = tmpIndex;
                }
            }
        }

        //
        int[][] newMatrix = new int[matrix.length][];
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
//                newMatrix[i][j] = Arrays.copyOf(matrix[i][j], matrix[i].length);
//                Arrays.sort(newMatrix[i]);
//                System.out.println(Arrays.toString(newMatrix[i]));
            }
        }
    }
}
