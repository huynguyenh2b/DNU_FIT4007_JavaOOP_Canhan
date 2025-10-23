package LapTrinhPhuongThuc;
public class ArraySum {

    // Phương thức tính tổng mảng
    public static int tinhTongMang(int[] arr) {
        int tong = 0;
        // Dùng vòng lặp for-each để duyệt mảng
        for (int x : arr) {
            tong += x;
        }
        return tong;
    }

    public static void main(String[] args) {
        // Khởi tạo sẵn một mảng để test
        int[] mangCuaToi = {10, 20, 30, 40, 50};

        int ketQua = tinhTongMang(mangCuaToi);

        System.out.println("Tổng của mảng là: " + ketQua);
    }
}