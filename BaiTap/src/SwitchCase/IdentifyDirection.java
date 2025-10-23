package SwitchCase;
import java.util.Scanner;

public class IdentifyDirection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a direction character (N, E, W, S): ");
        // Read the first character of the input string and convert it to uppercase
        char directionChar = scanner.next().toUpperCase().charAt(0);
        String direction;

        switch (directionChar) {
            case 'N':
                direction = "North";
                break;
            case 'E':
                direction = "East";
                break;
            case 'W':
                direction = "West";
                break;
            case 'S':
                direction = "South";
                break;
            default:
                direction = "Invalid direction character";
                break;
        }

        System.out.println("Direction: " + direction);
        scanner.close();
    }
}