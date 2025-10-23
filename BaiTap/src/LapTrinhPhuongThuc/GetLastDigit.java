package LapTrinhPhuongThuc;
import java.util.Scanner;

public class GetLastDigit {

    // Phương thức lấy chữ số cuối
    public static int getLastDigit(int n) {
        // Lấy giá trị tuyệt đối (để xử lý số âm) rồi chia lấy dư cho 10
        return Math.abs(n) % 10;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên n: ");
        int n = scanner.nextInt();

        int chuSoCuoi = getLastDigit(n);
        System.out.println("Chữ số cuối cùng là: " + chuSoCuoi);
    }
}