package ChuoiTrongJava;
import java.util.Scanner;

public class ConvertToUppercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();

        String upperCaseString = input.toUpperCase();

        System.out.println("Chuỗi in hoa: " + upperCaseString);
    }
}