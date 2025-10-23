import java.util.Scanner;

public class ReverseString2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi cần đảo ngược: ");
        String input = scanner.nextLine();

        StringBuilder sb = new StringBuilder(input);
        String reversedString = sb.reverse().toString();

        System.out.println("Chuỗi sau khi đảo ngược: " + reversedString);
    }
}