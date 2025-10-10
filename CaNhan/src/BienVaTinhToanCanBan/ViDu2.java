

import java.util.Scanner;

public class ViDu2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập bán kính hình tròn: ");
        double r = sc.nextDouble();
        double chuVi = (Math.PI * 2D) * r;
        double dienTich = Math.PI * r * r;
        System.out.println("Chu vi hình tròn = " + chuVi);
        System.out.println("Diện tích hình tròn = " + dienTich);
    }
}
