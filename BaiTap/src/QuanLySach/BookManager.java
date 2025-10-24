package QuanLySach;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BookManager {
    private ArrayList<Book> books;

    public BookManager() {
        this.books = new ArrayList<>();
    }

    // 1. Thêm sách (Kiểm tra ID duy nhất)
    public boolean addBook(Book b) {
        // Kiểm tra xem bookID đã tồn tại chưa
        if (searchBook(b.getBookID()) != null) {
            System.out.println("Lỗi: Book ID " + b.getBookID() + " đã tồn tại. Không thể thêm.");
            return false;
        }
        this.books.add(b);
        System.out.println("Thêm sách thành công!");
        return true;
    }

    // 2. Tìm sách theo Title (Nạp chồng)
    public ArrayList<Book> searchBook(String title) {
        ArrayList<Book> results = new ArrayList<>();
        for (Book book : this.books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                results.add(book);
            }
        }
        return results;
    }

    // 3. Tìm sách theo bookID (Nạp chồng)
    public Book searchBook(int bookID) {
        for (Book book : this.books) {
            if (book.getBookID() == bookID) {
                return book;
            }
        }
        return null; // Không tìm thấy
    }

    // 4. Xoá sách
    public boolean removeBook(int bookID) {
        Book bookToRemove = searchBook(bookID);
        if (bookToRemove != null) {
            this.books.remove(bookToRemove);
            System.out.println("Đã xoá sách có ID: " + bookID);
            return true;
        } else {
            System.out.println("Không tìm thấy sách có ID: " + bookID);
            return false;
        }
    }

    // 5. Hiển thị danh sách
    public void displayBooks() {
        if (this.books.isEmpty()) {
            System.out.println("Danh sách sách trống.");
            return;
        }
        System.out.println("--- Danh sách Sách ---");
        for (Book book : this.books) {
            // TÍNH ĐA HÌNH: Tự động gọi toString() của HardcoverBook hoặc EBook
            System.out.println(book.toString());
        }
    }

    // 6. Sắp xếp theo giá (không giảm - tăng dần)
    public void sortByPrice() {
        Collections.sort(this.books, new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return Long.compare(b1.getPrice(), b2.getPrice());
            }
        });
        System.out.println("Đã sắp xếp danh sách theo giá tăng dần.");
    }

    // 7. Sắp xếp theo loại (Hardcover > EBook)
    public void sortByType() {
        Collections.sort(this.books, new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                if (b1 instanceof HardcoverBook && b2 instanceof EBook) {
                    return -1; // Hardcover đứng trước
                }
                if (b1 instanceof EBook && b2 instanceof HardcoverBook) {
                    return 1; // EBook đứng sau
                }
                // Nếu cùng loại, sắp xếp theo ID
                return Integer.compare(b1.getBookID(), b2.getBookID());
            }
        });
        System.out.println("Đã sắp xếp: Sách cứng lên trước, Sách điện tử xuống sau.");
    }

    // 8. Tính tổng giá
    public long totalPrice() {
        long total = 0;
        for (Book book : this.books) {
            total += book.getPrice();
        }
        return total;
    }

    // 9. Tính tổng kích thước file (chỉ EBook)
    public double getTotalFileSize() {
        double totalSize = 0;
        for (Book book : this.books) {
            // Kiểm tra xem đối tượng có phải là EBook không
            if (book instanceof EBook) {
                // Ép kiểu (cast) về EBook để lấy fileSizeMB
                EBook eBook = (EBook) book;
                totalSize += eBook.getFileSizeMB();
            }
        }
        return totalSize;
    }
}