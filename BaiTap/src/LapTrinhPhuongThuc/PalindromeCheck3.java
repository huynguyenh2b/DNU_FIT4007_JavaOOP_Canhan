package LapTrinhPhuongThuc;
import java.util.Scanner;

public class PalindromeCheck3 {

    // Phương thức kiểm tra đối xứng
    public static boolean isDoiXung(String str) {
        String reversedString = new StringBuilder(str).reverse().toString();
        return str.equals(reversedString);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();

        if (isDoiXung(input)) {
            System.out.println("Đây là chuỗi đối xứng.");
        } else {
            System.out.println("Đây không phải là chuỗi đối xứng.");
        }
    }
}