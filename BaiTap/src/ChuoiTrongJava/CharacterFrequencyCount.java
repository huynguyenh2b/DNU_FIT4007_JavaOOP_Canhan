import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class CharacterFrequencyCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();

        Map<Character, Integer> charCountMap = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int count = charCountMap.getOrDefault(c, 0);
            charCountMap.put(c, count + 1);
        }

        System.out.println("Số lần xuất hiện của các ký tự:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " xuất hiện " + entry.getValue() + " lần");
        }
    }
}