package LapTrinhPhuongThuc;
import java.util.Scanner;

public class TriangleArea {

    // Phương thức tính diện tích theo công thức Heron
    public static double dienTichTamGiac(double a, double b, double c) {
        // 1. Kiểm tra điều kiện 3 cạnh có tạo thành tam giác không
        if (a + b <= c || a + c <= b || b + c <= a) {
            return -1; // Trả về -1 để báo lỗi
        }

        // 2. Tính nửa chu vi (p)
        double p = (a + b + c) / 2;

        // 3. Tính diện tích
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập cạnh b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập cạnh c: ");
        double c = scanner.nextDouble();

        double dienTich = dienTichTamGiac(a, b, c);

        if (dienTich == -1) {
            System.out.println("Ba cạnh không tạo thành một tam giác.");
        } else {
            System.out.println("Diện tích tam giác là: " + dienTich);
        }
    }
}