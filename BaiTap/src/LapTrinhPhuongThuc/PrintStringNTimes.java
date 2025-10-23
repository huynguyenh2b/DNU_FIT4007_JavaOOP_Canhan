package LapTrinhPhuongThuc;
import java.util.Scanner;

public class PrintStringNTimes {

    // Phương thức void, nhận 2 tham số
    public static void printString(String s, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi s: ");
        String s = scanner.nextLine();
        System.out.print("Nhập số lần n: ");
        int n = scanner.nextInt();

        printString(s, n);
    }
}