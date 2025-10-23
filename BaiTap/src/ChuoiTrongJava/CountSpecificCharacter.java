import java.util.Scanner;

public class CountSpecificCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine().toLowerCase();

        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a') {
                count++;
            }
        }

        System.out.println("Số ký tự 'a' (bao gồm cả 'A') trong chuỗi: " + count);
    }
}