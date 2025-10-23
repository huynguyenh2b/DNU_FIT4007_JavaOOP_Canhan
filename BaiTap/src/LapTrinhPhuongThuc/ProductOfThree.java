package LapTrinhPhuongThuc;
import java.util.Scanner;

public class ProductOfThree {

    // Phương thức tính tích 3 số
    public static int tinhTich(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số b: ");
        int b = scanner.nextInt();
        System.out.print("Nhập số c: ");
        int c = scanner.nextInt();

        int ketQua = tinhTich(a, b, c);
        System.out.println("Tích 3 số là: " + ketQua);
    }
}