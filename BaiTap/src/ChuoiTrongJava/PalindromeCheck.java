package ChuoiTrongJava;
import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi cần kiểm tra đối xứng: ");
        String input = scanner.nextLine();

        String reversedString = new StringBuilder(input).reverse().toString();

        if (input.equals(reversedString)) {
            System.out.println("'" + input + "' là chuỗi đối xứng.");
        } else {
            System.out.println("'" + input + "' không phải là chuỗi đối xứng.");
        }
    }
}