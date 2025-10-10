import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("Enter an integer greater than 0: ");
            n = scanner.nextInt();
        } while (n <= 0);

        System.out.println("You entered a valid number: " + n);
        scanner.close();
    }
}