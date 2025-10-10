import java.util.Scanner;

public class PrintNumbersFromNDownTo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer N: ");
        int n = scanner.nextInt();

        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
        scanner.close();
    }
}