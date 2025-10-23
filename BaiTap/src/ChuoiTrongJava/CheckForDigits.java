package ChuoiTrongJava;
import java.util.Scanner;

public class CheckForDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();

        boolean containsDigit = false;

        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                containsDigit = true;
                break;
            }
        }

        if (containsDigit) {
            System.out.println("Chuỗi có chứa ít nhất một ký tự số.");
        } else {
            System.out.println("Chuỗi không chứa ký tự số nào.");
        }
    }
}