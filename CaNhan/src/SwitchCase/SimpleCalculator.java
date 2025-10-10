import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        double a = scanner.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);
        double result = 0;
        boolean isValid = true;

        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                    isValid = false;
                }
                break;
            case '%':
                if (b != 0) {
                    result = a % b;
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                    isValid = false;
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                isValid = false;
                break;
        }

        if (isValid) {
            System.out.println("Result: " + a + " " + operator + " " + b + " = " + result);
        }

        scanner.close();
    }
}