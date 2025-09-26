import java.util.Scanner;

public class TriangleSidesValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập cạnh a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập cạnh b: ");
        int b = scanner.nextInt();

        System.out.print("Nhập cạnh c: ");
        int c = scanner.nextInt();

        if (a > 0 && b > 0 && c > 0 &&
                a + b > c &&
                a + c > b &&
                b + c > a) {
            System.out.println("Ba số này có thể là độ dài 3 cạnh của một tam giác.");
        } else {
            System.out.println("Ba số này không thể là độ dài 3 cạnh của một tam giác.");
        }

        scanner.close();
    }
}