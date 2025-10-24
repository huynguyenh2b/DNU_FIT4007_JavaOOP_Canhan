package DaHinh;
import java.util.Scanner;

public class Menu {
    private StudentManager manager;
    private Scanner sc;

    public Menu() {
        this.manager = new StudentManager();
        this.sc = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            int choice = choiceMenu();
            switch (choice) {
                case 1:
                    handleAddStudent();
                    break;
                case 2:
                    manager.showStudents();
                    break;
                case 3:
                    handleSearchStudent();
                    break;
                case 4:
                    handleDeleteStudent();
                    break;
                case 5:
                    handleUpdateStudent();
                    break;
                case 6:
                    handleSortMenu();
                    break;
                case 7:
                    System.out.println("Thoát chương trình.");
                    sc.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
            System.out.println("(Nhấn Enter để tiếp tục...)");
            sc.nextLine();
        }
    }

    public int choiceMenu() {
        System.out.println("\n======= MENU QUẢN LÝ SINH VIÊN =======");
        System.out.println("1. Nhập thông tin sinh viên");
        System.out.println("2. Xem danh sách sinh viên");
        System.out.println("3. Tìm kiếm sinh viên theo Mã SV");
        System.out.println("4. Xoá sinh viên theo Mã SV");
        System.out.println("5. Cập nhật sinh viên");
        System.out.println("6. Sắp xếp sinh viên");
        System.out.println("7. Thoát.");
        System.out.print("Nhập lựa chọn của bạn: ");
        int choice = sc.nextInt();
        sc.nextLine(); // Tiêu thụ newline
        return choice;
    }

    private void handleAddStudent() {
        System.out.println("1.1. Nhập sinh viên IT");
        System.out.println("1.2. Nhập sinh viên BA");
        System.out.print("Chọn loại sinh viên: ");
        int type = sc.nextInt();
        sc.nextLine(); // Tiêu thụ newline

        Student s = null; // Khai báo 1 biến kiểu lớp CHA

        if (type == 1) {
            s = new StudentIT(); // Khởi tạo đối tượng lớp CON
        } else if (type == 2) {
            s = new StudentBA(); // Khởi tạo đối tượng lớp CON
        } else {
            System.out.println("Loại không hợp lệ.");
            return;
        }

        // TÍNH ĐA HÌNH:
        // Dù s là StudentIT hay StudentBA, Java sẽ tự động
        // gọi đúng phương thức input() đã được ghi đè.
        s.input(sc);

        if (manager.addStudent(s)) {
            System.out.println("Thêm sinh viên thành công!");
        }
    }

    private void handleSearchStudent() {
        System.out.print("Nhập Mã SV cần tìm: ");
        String id = sc.nextLine();
        Student s = manager.searchStudent(id);
        if (s != null) {
            System.out.println("Tìm thấy sinh viên:");
            System.out.println(s.toString());
        } else {
            System.out.println("Không tìm thấy sinh viên có mã " + id);
        }
    }

    private void handleDeleteStudent() {
        System.out.print("Nhập Mã SV cần xoá: ");
        String id = sc.nextLine();
        if (manager.deleteStudent(id)) {
            System.out.println("Xoá thành công!");
        } else {
            System.out.println("Không tìm thấy sinh viên để xoá.");
        }
    }

    private void handleUpdateStudent() {
        System.out.print("Nhập Mã SV cần cập nhật: ");
        String id = sc.nextLine();
        Student oldStudent = manager.searchStudent(id);

        if (oldStudent == null) {
            System.out.println("Không tìm thấy sinh viên.");
            return;
        }

        System.out.println("Tìm thấy: " + oldStudent.toString());
        System.out.println("Nhập thông tin mới (bạn có thể nhập lại Mã SV cũ hoặc mới):");

        Student newStudent;
        if (oldStudent instanceof StudentIT) {
            newStudent = new StudentIT();
        } else {
            newStudent = new StudentBA();
        }

        // TÍNH ĐA HÌNH: Gọi input() tương ứng
        newStudent.input(sc);

        // Cập nhật sinh viên tại vị trí của ID cũ
        if (manager.updateStudent(id, newStudent)) {
            System.out.println("Cập nhật thành công!");
        } else {
            // Trường hợp này ít khi xảy ra nếu logic tìm kiếm đúng
            System.out.println("Cập nhật thất bại.");
        }
    }

    private void handleSortMenu() {
        System.out.println("--- Sắp xếp sinh viên ---");
        System.out.println("6.1. Sắp xếp theo điểm trung bình");
        System.out.println("6.2. Sắp xếp theo tuổi");
        System.out.println("6.3. Sắp xếp theo mã sinh viên");
        System.out.println("6.4. Sắp xếp theo ngành học (IT > BA)");
        System.out.print("Chọn kiểu sắp xếp: ");

        // Đọc choice_sub (dùng String để tránh lỗi)
        String choiceSub = sc.nextLine();

        switch (choiceSub) {
            case "6.1":
                manager.sortByScore();
                break;
            case "6.2":
                manager.sortByAge();
                break;
            case "6.3":
                manager.sortByID();
                break;
            case "6.4":
                manager.SortByType();
                break;
            default:
                System.out.println("Lựa chọn sắp xếp không hợp lệ.");
                return;
        }
        // Hiển thị danh sách sau khi sắp xếp
        manager.showStudents();
    }

    // Phương thức main để chạy chương trình
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.run();
    }
}