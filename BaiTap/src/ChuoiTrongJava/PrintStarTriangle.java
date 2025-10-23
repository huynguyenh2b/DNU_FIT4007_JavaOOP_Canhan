import java.util.Scanner;

public class PrintStarTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int n = scanner.nextInt();

        String stars = "";

        for (int i = 1; i <= n; i++) {
            stars += "*";
            System.out.println(stars);
        }
    }
}