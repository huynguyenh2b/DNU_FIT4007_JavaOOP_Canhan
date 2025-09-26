import java.util.Scanner;

public class StringComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi a: ");
        String a = scanner.nextLine();

        System.out.print("Nhập chuỗi b: ");
        String b = scanner.nextLine();

        if (a.equals(b)) {
            System.out.println("Hai chuỗi giống nhau.");
        } else {
            System.out.println("Hai chuỗi khác nhau.");
        }

        scanner.close();
    }
}