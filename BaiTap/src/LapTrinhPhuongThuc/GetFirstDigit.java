package LapTrinhPhuongThuc;
import java.util.Scanner;

public class GetFirstDigit {

    // Phương thức lấy chữ số đầu
    public static int getFirstDigit(int n) {
        // Chỉ xử lý số tự nhiên (theo đề)
        if (n < 0) n = -n;

        // Lặp chia cho 10 cho đến khi chỉ còn 1 chữ số
        while (n >= 10) {
            n = n / 10;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tự nhiên n: ");
        int n = scanner.nextInt();

        int chuSoDau = getFirstDigit(n);
        System.out.println("Chữ số đầu tiên là: " + chuSoDau);
    }
}