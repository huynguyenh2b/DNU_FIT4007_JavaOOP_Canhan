import java.util.Scanner;

public class CalculateFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer N: ");
        int n = scanner.nextInt();
        long factorial = 1;

        if (n < 0) {
            System.out.println("Cannot calculate factorial for a negative number.");
        } else {
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println(n + "! = " + factorial);
        }
        scanner.close();
    }
}