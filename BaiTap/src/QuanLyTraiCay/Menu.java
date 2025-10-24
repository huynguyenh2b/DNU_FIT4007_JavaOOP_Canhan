package QuanLyTraiCay;

import java.util.Scanner;

/**
 * 5. Chương trình Menu Driven Program
 */
public class Menu {
    private FruitList fruitManager;
    private Scanner sc;

    public Menu() {
        fruitManager = new FruitList();
        sc = new Scanner(System.in);
    }

    // Phương thức main để khởi chạy chương trình
    public static void main(String[] args) {
        Menu app = new Menu();
        app.run();
    }

    // Vòng lặp chính của chương trình
    public void run() {
        while (true) {
            showMainMenu();
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    handleAddFruit();
                    break;
                case 2:
                    fruitManager.printList();
                    break;
                case 3:
                    fruitManager.printListPriceOver20();
                    break;
                case 4:
                    System.out.println("Tổng số trái cây trong danh sách: " + fruitManager.getTotalCount());
                    break;
                case 5:
                    System.out.println("Đã thoát chương trình.");
                    sc.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
            System.out.println("\n(Nhấn Enter để tiếp tục...)");
            sc.nextLine();
        }
    }

    // Hiển thị menu
    private void showMainMenu() {
        System.out.println("\n======= MENU QUẢN LÝ TRÁI CÂY =======");
        System.out.println("1. Thêm Fruit (Trong nước hoặc Nhập khẩu)");
        System.out.println("2. In ra danh sách Fruit");
        System.out.println("3. In danh sách Fruit có giá bán > 20");
        System.out.println("4. Xem tổng số Fruit");
        System.out.println("5. Thoát");
        System.out.print("Nhập lựa chọn của bạn: ");
    }

    // Xử lý logic thêm trái cây
    private void handleAddFruit() {
        System.out.println("--- Thêm Trái cây ---");
        System.out.println("1. Thêm Trái cây Trong nước (FruitIn)");
        System.out.println("2. Thêm Trái cây Nhập khẩu (FruitOut)");
        System.out.print("Chọn loại trái cây: ");
        int type = Integer.parseInt(sc.nextLine());

        Fruit newFruit = null; // Khai báo biến kiểu lớp CHA

        if (type == 1) {
            newFruit = new FruitIn(); // Tạo đối tượng lớp CON
        } else if (type == 2) {
            newFruit = new FruitOut(); // Tạo đối tượng lớp CON
        } else {
            System.out.println("Loại không hợp lệ.");
            return;
        }

        // TÍNH ĐA HÌNH:
        // Dù newFruit là FruitIn hay FruitOut, Java sẽ tự động
        // gọi đúng phương thức input() đã được ghi đè.
        newFruit.input(sc);

        // Thêm vào danh sách quản lý
        fruitManager.addFruit(newFruit);
    }
}
