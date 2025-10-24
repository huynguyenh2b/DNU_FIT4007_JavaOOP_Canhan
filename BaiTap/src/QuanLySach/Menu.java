package QuanLySach;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private BookManager manager;
    private Scanner sc;

    public Menu() {
        this.manager = new BookManager();
        this.sc = new Scanner(System.in);
    }

    // Phương thức main để khởi chạy
    public static void main(String[] args) {
        Menu app = new Menu();
        app.run();
    }

    public void run() {
        while (true) {
            showMainMenu();
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    manager.displayBooks();
                    break;
                case 2:
                    handleAddBook();
                    break;
                case 3:
                    handleSearchBook();
                    break;
                case 4:
                    handleRemoveBook();
                    break;
                case 5:
                    handleSortBooks();
                    break;
                case 6:
                    System.out.println("Tổng giá sách: " + manager.totalPrice());
                    break;
                case 7:
                    System.out.println("Tổng kích thước EBook (MB): " + manager.getTotalFileSize());
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    sc.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
            System.out.println("(Nhấn Enter để tiếp tục...)");
            sc.nextLine();
        }
    }

    private void showMainMenu() {
        System.out.println("\n======= MENU QUẢN LÝ SÁCH =======");
        System.out.println("1. Xem danh sách sách");
        System.out.println("2. Thêm sách");
        System.out.println("3. Tìm sách");
        System.out.println("4. Xoá sách theo bookID");
        System.out.println("5. Sắp xếp");
        System.out.println("6. Tính tổng giá sách");
        System.out.println("7. Tính tổng kích thước sách điện tử");
        System.out.println("0. Thoát");
        System.out.print("Nhập lựa chọn của bạn: ");
    }

    private void handleAddBook() {
        System.out.println("--- Thêm sách ---");
        System.out.println("2.1. Thêm sách cứng (Hardcover)");
        System.out.println("2.2. Thêm sách điện tử (EBook)");
        System.out.print("Chọn loại sách: ");
        int type = Integer.parseInt(sc.nextLine());

        Book newBook = null;

        if (type == 1) {
            newBook = new HardcoverBook();
        } else if (type == 2) {
            newBook = new EBook();
        } else {
            System.out.println("Loại không hợp lệ.");
            return;
        }

        // TÍNH ĐA HÌNH: Dù là HardcoverBook hay EBook,
        // Java sẽ tự động gọi đúng phương thức input() đã được ghi đè.
        newBook.input(sc);
        manager.addBook(newBook);
    }

    private void handleSearchBook() {
        System.out.println("--- Tìm sách ---");
        System.out.println("3.1. Tìm theo Tiêu đề (Title)");
        System.out.println("3.2. Tìm theo Book ID");
        System.out.print("Chọn kiểu tìm kiếm: ");
        int type = Integer.parseInt(sc.nextLine());

        if (type == 1) {
            System.out.print("Nhập tiêu đề cần tìm: ");
            String title = sc.nextLine();
            ArrayList<Book> results = manager.searchBook(title);
            if (results.isEmpty()) {
                System.out.println("Không tìm thấy sách nào có tiêu đề: " + title);
            } else {
                System.out.println("Kết quả tìm kiếm:");
                results.forEach(System.out::println); // In ra từng kết quả
            }
        } else if (type == 2) {
            System.out.print("Nhập Book ID cần tìm: ");
            int id = Integer.parseInt(sc.nextLine());
            Book result = manager.searchBook(id);
            if (result == null) {
                System.out.println("Không tìm thấy sách có ID: " + id);
            } else {
                System.out.println("Kết quả tìm kiếm:");
                System.out.println(result.toString());
            }
        } else {
            System.out.println("Loại không hợp lệ.");
        }
    }

    private void handleRemoveBook() {
        System.out.print("Nhập Book ID của sách cần xoá: ");
        int id = Integer.parseInt(sc.nextLine());
        manager.removeBook(id);
    }

    private void handleSortBooks() {
        System.out.println("--- Sắp xếp ---");
        System.out.println("5.1. Sắp xếp tăng dần theo giá");
        System.out.println("5.2. Sắp xếp theo loại (Hardcover > EBook)");
        System.out.print("Chọn kiểu sắp xếp: ");
        int type = Integer.parseInt(sc.nextLine());

        if (type == 1) {
            manager.sortByPrice();
        } else if (type == 2) {
            manager.sortByType();
        } else {
            System.out.println("Loại không hợp lệ.");
            return;
        }
        // Hiển thị danh sách sau khi đã sắp xếp
        manager.displayBooks();
    }
}
