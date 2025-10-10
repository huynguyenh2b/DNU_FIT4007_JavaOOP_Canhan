

import java.util.Scanner;

public class ViDu1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên a: ");
        int a = sc.nextInt();
        System.out.print("Nhập số nguyên b: ");
        int b = sc.nextInt();
        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;
        double thuong = (double)0.0F;
        if (b != 0) {
            thuong = (double)a / (double)b;
        } else {
            System.out.println("Không thể chia cho 0!");
        }

        System.out.println("Tổng = " + tong);
        System.out.println("Hiệu = " + hieu);
        System.out.println("Tích = " + tich);
        if (b != 0) {
            System.out.println("Thương = " + thuong);
        }

    }
}
