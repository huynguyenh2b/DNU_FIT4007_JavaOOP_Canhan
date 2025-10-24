package TruuTuong;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    // Sử dụng IManager thay vì StudentManager để tăng tính trừu tượng
    private IManager manager;
    private Scanner sc;

    public Menu() {
        this.manager = new StudentManager();
        this.sc = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.run();
    }

    public void run() {
        while (true) {
            displayMainMenu();
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    manager.displayAllStudents();
                    break;
                case 2:
                    handleAddStudent();
                    break;
                case 3:
                    handleFindStudent();
                    break;
                case 4:
                    handleRemoveStudent();
                    break;
                case 5:
                    handleSortStudent();
                    break;
                case 6:
                    handleEditStudent();
                    break;
                case 7:
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

    private void displayMainMenu() {
        System.out.println("\n======= MENU QUẢN LÝ SINH VIÊN =======");
        System.out.println("1. Hiện thị danh sách sinh viên");
        System.out.println("2. Thêm sinh viên");
        System.out.println("3. Tìm kiếm sinh viên");
        System.out.println("4. Xoá sinh viên");
        System.out.println("5. Sắp xếp sinh viên");
        System.out.println("6. Chỉnh sửa thông tin sinh viên");
        System.out.println("7. Thoát chương trình");
        System.out.print("Nhập lựa chọn của bạn: ");
    }

    private void handleAddStudent() {
        System.out.println("--- Thêm sinh viên ---");
        System.out.println("2.1. Thêm sinh viên IT");
        System.out.println("2.2. Thêm sinh viên BA");
        System.out.print("Chọn loại sinh viên: ");
        int type = Integer.parseInt(sc.nextLine());

        Student s = null; // Khai báo 1 biến kiểu lớp CHA

        if (type == 1) {
            s = new StudentIT(); // Khởi tạo đối tượng lớp CON
        } else if (type == 2) {
            s = new StudentBA(); // Khởi tạo đối tượng lớp CON
        } else {
            System.out.println("Loại không hợp lệ.");
            return;
        }

        // TÍNH ĐA HÌNH: Tự động gọi input() của IT hoặc BA
        s.input(sc);
        manager.addStudent(s);
    }

    private void handleFindStudent() {
        System.out.println("--- Tìm kiếm sinh viên ---");
        System.out.println("3.1. Tìm theo mã sinh viên");
        System.out.println("3.2. Tìm theo tuổi");
        System.out.print("Chọn kiểu tìm kiếm: ");
        int type = Integer.parseInt(sc.nextLine());

        if (type == 1) {
            System.out.print("Nhập Mã SV cần tìm: ");
            String masv = sc.nextLine();
            Student s = manager.findStudent(masv);
            if (s != null) {
                System.out.println("Tìm thấy sinh viên:");
                System.out.println(s.toString());
            } else {
                System.out.println("Không tìm thấy sinh viên.");
            }
        } else if (type == 2) {
            System.out.print("Nhập tuổi cần tìm: ");
            int age = Integer.parseInt(sc.nextLine());
            ArrayList<Student> results = manager.findStudent(age);
            if (results.isEmpty()) {
                System.out.println("Không tìm thấy sinh viên nào ở tuổi " + age);
            } else {
                System.out.println("Các sinh viên tìm thấy:");
                for (Student s : results) {
                    System.out.println(s.toString());
                }
            }
        } else {
            System.out.println("Lựa chọn không hợp lệ.");
        }
    }

    private void handleRemoveStudent() {
        System.out.print("Nhập Mã SV cần xoá: ");
        String masv = sc.nextLine();
        manager.removeStudent(masv);
    }

    private void handleSortStudent() {
        System.out.println("--- Sắp xếp sinh viên ---");
        System.out.println("5.1. Sắp xếp theo tuổi (tăng dần)");
        System.out.println("5.2. Sắp xếp theo điểm trung bình (tăng dần)");
        System.out.print("Chọn kiểu sắp xếp: ");
        int type = Integer.parseInt(sc.nextLine());

        if (type == 1) {
            manager.sortByAge();
        } else if (type == 2) {
            manager.sortByScore();
        } else {
            System.out.println("Lựa chọn không hợp lệ.");
            return;
        }
        // Hiển thị danh sách sau khi sắp xếp
        manager.displayAllStudents();
    }

    private void handleEditStudent() {
        System.out.print("Nhập Mã SV cần chỉnh sửa: ");
        String masv = sc.nextLine();
        Student oldStudent = manager.findStudent(masv);

        if (oldStudent == null) {
            System.out.println("Không tìm thấy sinh viên.");
            return;
        }

        System.out.println("Thông tin sinh viên cũ:");
        System.out.println(oldStudent.toString());

        System.out.println("Nhập thông tin mới:");
        Student newStudent;

        // Tạo đối tượng mới cùng loại với đối tượng cũ
        if (oldStudent instanceof StudentIT) {
            newStudent = new StudentIT();
        } else {
            newStudent = new StudentBA();
        }

        // Yêu cầu nhập thông tin mới
        newStudent.input(sc);

        // Gọi phương thức edit
        manager.editStudent(masv, newStudent);
    }
}
