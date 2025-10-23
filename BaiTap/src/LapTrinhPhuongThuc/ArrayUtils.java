package LapTrinhPhuongThuc;
import java.util.Arrays; // Import để dùng Arrays.toString()

public class ArrayUtils {

    // 1. Phương thức in mảng
    public static void printArray(int[] arr) {
        // Dùng Arrays.toString() để in mảng cho đẹp
        System.out.println(Arrays.toString(arr));
    }

    // 2. Phương thức trả về mảng đảo ngược
    public static int[] reverseArray(int[] arr) {
        int n = arr.length;
        int[] reversedArr = new int[n]; // Tạo mảng mới

        for (int i = 0; i < n; i++) {
            reversedArr[i] = arr[n - 1 - i];
        }

        return reversedArr; // Trả về mảng mới
    }

    public static void main(String[] args) {
        int[] mangGoc = {1, 2, 3, 4, 5, 6, 7};

        System.out.print("Mảng gốc: ");
        printArray(mangGoc); // Gọi hàm in

        // Gọi hàm đảo ngược và hứng kết quả
        int[] mangDaoNguoc = reverseArray(mangGoc);

        System.out.print("Mảng đảo ngược: ");
        printArray(mangDaoNguoc); // Gọi hàm in
    }
}