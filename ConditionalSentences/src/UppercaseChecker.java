import java.util.Scanner;

public class UppercaseChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một ký tự: ");
        char ch = scanner.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " là chữ cái in hoa.");
        } else {
            System.out.println(ch + " không phải là chữ cái in hoa.");
        }

        scanner.close();
    }
}