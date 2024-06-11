package neos.com.main;

import neos.com.matrix.MatrixFun;

public class Main {
    public static void main(String[] args) {
        MatrixFun matrixFun = new MatrixFun(8);

        // Gọi phương thức init để nhập dữ liệu cho ma trận
        matrixFun.init();
        matrixFun.printMatrix();

        // Gọi phương thức tính tổng đường chéo
        matrixFun.tongDuongCheo();

        // Gọi phương thức sắp xếp hàng tăng dân
        matrixFun.sapXepHangTangDan();
        matrixFun.printMatrix();
    }
}