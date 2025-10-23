package DongGoi.pManagement;

public class Employee {

    // --- VÍ DỤ 1 ---
    // Thuộc tính 'private' (thay cho 'a').
    // Chỉ có thể truy cập trực tiếp từ bên trong class Employee.
    // Bất kỳ truy cập nào từ bên ngoài (kể cả Manager hay HRSpecialist)
    // đều phải thông qua getter/setter (nếu được phép).
    private int salary;

    // Constructor để khởi tạo giá trị
    public Employee(int initialSalary) {
        if (initialSalary > 0) {
            this.salary = initialSalary;
        } else {
            this.salary = 3000; // Mức lương tối thiểu
        }
    }

    // --- VÍ DỤ 2 ---
    // Phương thức 'default' (không ghi access modifier).
    // (Thay cho inc() tăng 1, ta làm hàm tăng lương thực tế hơn).
    // Chỉ dùng được trong cùng package 'pManagement' (ví dụ: class Manager).
    // Class HRSpecialist (ở package pHR) sẽ KHÔNG thể gọi hàm này.
    void giveRaise(int amount) {
        if (amount > 0) {
            this.salary += amount;
            System.out.println("Nhân viên được tăng lương. Lương mới: " + this.salary);
        }
    }

    // --- VÍ DỤ 3 ---
    // Phương thức 'protected'.
    // (Thay cho sqr() trả về a^2, ta làm hàm tính thưởng cơ bản).
    // Dùng được trong cùng package 'pManagement' (class Manager)
    // VÀ trong các subclass (class HRSpecialist) dù khác package.
    protected double calculateBonusBase() {
        // Giả sử thưởng cơ bản là 10% lương
        return this.salary * 0.1;
    }

    // --- VÍ DỤ 4 ---
    // Phương thức 'public' (Getter và Setter).
    // (Thay cho getA() và setA()).
    // Có thể truy cập từ bất kỳ đâu trong project.

    /**
     * Hàm public 'getter' để lấy giá trị lương một cách an toàn.
     */
    public int getSalary() {
        return this.salary;
    }

    /**
     * Hàm public 'setter' để thay đổi giá trị lương một cách có kiểm soát.
     */
    public void setSalary(int newSalary) {
        if (newSalary > 50000) {
            System.out.println("Lỗi: Lương vượt quá khung quy định.");
        } else if (newSalary < 3000) {
            System.out.println("Lỗi: Lương thấp hơn mức tối thiểu.");
        } else {
            this.salary = newSalary;
            System.out.println("Cập nhật lương thành công: " + this.salary);
        }
    }
}
