package LapTrinhPhuongThuc;
import java.util.Scanner;

public class ToBinaryString {

    // Phương thức chuyển sang nhị phân
    // Cách 1: Dùng hàm có sẵn (đơn giản nhất)
    public static String toBinary(int n) {
        return Integer.toBinaryString(n);
    }

    // // Cách 2: Tự làm (nếu không được dùng hàm có sẵn)
    // public static String toBinaryManual(int n) {
    //     if (n == 0) {
    //         return "0";
    //     }
    //     StringBuilder binaryString = new StringBuilder();
    //     while (n > 0) {
    //         binaryString.append(n % 2);
    //         n = n / 2;
    //     }
    //     return binaryString.reverse().toString();
    // }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tự nhiên n: ");
        int n = scanner.nextInt();

        String binary = toBinary(n);
        System.out.println("Dạng nhị phân của " + n + " là: " + binary);
    }
}