import java.util.Scanner;

public class IntegerChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số thực: ");
        double number = scanner.nextDouble();

        if (number == (int)number) {
            System.out.println(number + " là số nguyên.");
        } else {
            System.out.println(number + " không phải là số nguyên.");
        }

        scanner.close();
    }
}