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

        // Gọi phương thức sắp xếp cột đầu tiên tăng dân
        matrixFun.sapXepCotDauTienTangDan();

        // Gọi phương thức sắp xếp đường chéo trái tăng dần
        matrixFun.sapXepDuongCheoTraiTangDan();

        // Gọi phương thức sắp xếp đường chéo phải tăng dần
        matrixFun.sapXepDuongCheoPhaiTangDan();

        // Gọi phương thức in ra cột có tổng lớn nhất
        matrixFun.inRaCotTongLonNhat();

        // Gọi phương thức in ra cột có tổng lớn nhất
        matrixFun.sapXepCacCot();
    }
}