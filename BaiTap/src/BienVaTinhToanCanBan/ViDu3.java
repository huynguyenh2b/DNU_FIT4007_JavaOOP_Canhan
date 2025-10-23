package BienVaTinhToanCanBan;

import java.util.Scanner;

public class ViDu3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        double dai = sc.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        double rong = sc.nextDouble();
        double chuVi = (double)2.0F * (dai + rong);
        double dienTich = dai * rong;
        System.out.println("Chu vi hình chữ nhật = " + chuVi);
        System.out.println("Diện tích hình chữ nhật = " + dienTich);
    }
}
