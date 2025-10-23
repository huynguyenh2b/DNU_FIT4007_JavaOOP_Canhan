package SwitchCase;
import java.util.Scanner;

public class IdentifyGender {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter gender code (0: Male, 1: Female, 2: Other): ");
        int genderCode = scanner.nextInt();
        String gender;

        switch (genderCode) {
            case 0:
                gender = "Male";
                break;
            case 1:
                gender = "Female";
                break;
            case 2:
                gender = "Other";
                break;
            default:
                gender = "Invalid code";
                break;
        }

        System.out.println("Gender is: " + gender);
        scanner.close();
    }
}