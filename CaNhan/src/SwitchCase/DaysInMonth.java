import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        int numberOfDays = 0;

        switch (month) {
            // Months with 31 days
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numberOfDays = 31;
                break;

            // Months with 30 days
            case 4:
            case 6:
            case 9:
            case 11:
                numberOfDays = 30;
                break;

            // February
            case 2:
                // Check for leap year
                boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
                if (isLeapYear) {
                    numberOfDays = 29;
                } else {
                    numberOfDays = 28;
                }
                break;

            default:
                System.out.println("Invalid month.");
                break;
        }

        if (numberOfDays != 0) {
            System.out.println("Number of days in month " + month + " of year " + year + " is " + numberOfDays);
        }

        scanner.close();
    }
}