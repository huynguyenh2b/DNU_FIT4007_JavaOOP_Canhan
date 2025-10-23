package OOPCacPhuongThuc;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator; // Import để sắp xếp

public class TestBookList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> bookList = new ArrayList<>();

        System.out.print("Nhập số lượng cuốn sách (N): ");
        int n = Integer.parseInt(scanner.nextLine());

        // 1. Nhập N cuốn sách
        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Nhập sách thứ " + (i + 1) + " ---");
            Book newBook = new Book();
            newBook.input(scanner);
            bookList.add(newBook);
        }

        // 2. In ra thông tin N cuốn sách
        System.out.println("\n--- DANH SÁCH SÁCH VỪA NHẬP ---");
        for (Book book : bookList) {
            System.out.println(book);
        }

        // 3. In thông tin sách có giá cao nhất
        System.out.println("\n--- SÁCH CÓ GIÁ CAO NHẤT ---");
        double maxPrice = -1;
        // Tìm giá cao nhất
        for (Book book : bookList) {
            if (book.getPrice() > maxPrice) {
                maxPrice = book.getPrice();
            }
        }
        // In ra những sách có giá bằng maxPrice
        for (Book book : bookList) {
            if (book.getPrice() == maxPrice) {
                System.out.println(book);
            }
        }

        // 4. In thông tin sách có tên là "Java OOP"
        System.out.println("\n--- TÌM SÁCH 'Java OOP' ---");
        boolean found = false;
        for (Book book : bookList) {
            // Dùng equalsIgnoreCase để không phân biệt hoa thường
            if (book.getName().equalsIgnoreCase("Java OOP")) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sách nào tên 'Java OOP'.");
        }

        // 5. Sắp xếp tăng dần theo quantity
        // Sử dụng Comparator.comparingInt và Method Reference (Book::getQuantity)
        bookList.sort(Comparator.comparingInt(Book::getQuantity));
        System.out.println("\n--- DS SẮP XẾP TĂNG DẦN THEO SỐ LƯỢNG ---");
        for (Book book : bookList) {
            System.out.println(book);
        }

        // 6. Sắp xếp giảm dần theo price
        // Sử dụng comparingDouble và .reversed()
        bookList.sort(Comparator.comparingDouble(Book::getPrice).reversed());
        System.out.println("\n--- DS SẮP XẾP GIẢM DẦN THEO GIÁ ---");
        for (Book book : bookList) {
            System.out.println(book);
        }

        scanner.close();
    }
}
