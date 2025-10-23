package ChuoiTrongJava;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();

        if (input.isEmpty()) {
            System.out.println("Số từ trong chuỗi: 0");
        } else {
            String[] words = input.split(" ");
            System.out.println("Số từ trong chuỗi: " + words.length);
        }
    }
}