package SwitchCase;
import java.util.Scanner;

public class ReadSingleDigitNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a single digit number (0-9): ");
        int number = scanner.nextInt();
        String numberInVietnamese;

        switch (number) {
            case 0:
                numberInVietnamese = "Không";
                break;
            case 1:
                numberInVietnamese = "Một";
                break;
            case 2:
                numberInVietnamese = "Hai";
                break;
            case 3:
                numberInVietnamese = "Ba";
                break;
            case 4:
                numberInVietnamese = "Bốn";
                break;
            case 5:
                numberInVietnamese = "Năm";
                break;
            case 6:
                numberInVietnamese = "Sáu";
                break;
            case 7:
                numberInVietnamese = "Bảy";
                break;
            case 8:
                numberInVietnamese = "Tám";
                break;
            case 9:
                numberInVietnamese = "Chín";
                break;
            default:
                numberInVietnamese = "Not a single digit number";
                break;
        }

        System.out.println("Result: " + numberInVietnamese);
        scanner.close();
    }
}