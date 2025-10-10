import java.util.Scanner;

public class ViDu10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ký tự thường (từ 'a' đến 'y'): ");
        char ch = sc.next().charAt(0);
        char nextChar = (char)(ch + 1);
        System.out.println("Ký tự liền sau " + ch + " là: " + nextChar);
    }
}
