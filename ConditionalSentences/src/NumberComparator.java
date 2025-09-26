import java.util.Scanner;

public class NumberComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập số nguyên b: ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("Số lớn hơn là: " + a);
        } else if (b > a) {
            System.out.println("Số lớn hơn là: " + b);
        } else {
            System.out.println("Hai số bằng nhau.");
        }

        scanner.close();
    }
}