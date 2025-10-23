package OOPHamKhoiTao;
public class Student {
    // 1. Các thuộc tính (attributes)
    private String masv;
    private String name;
    private int age;

    // 2. Hàm khởi tạo mặc định (default constructor)
    public Student() {
        // Có thể gán giá trị mặc định ở đây
        // ví dụ: this.masv = "000";
    }

    // 3. Hàm khởi tạo có thuộc tính (parameterized constructor)
    public Student(String masv, String name, int age) {
        // 'this.masv' là thuộc tính của class
        // 'masv' là tham số truyền vào
        this.masv = masv;
        this.name = name;
        this.age = age;
    }

    // 4. Các phương thức Getter (lấy giá trị)
    public String getMasv() {
        return masv;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // 5. Các phương thức Setter (thiết lập giá trị)
    public void setMasv(String masv) {
        this.masv = masv;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        // Có thể thêm logic kiểm tra, ví dụ tuổi phải > 0
        if (age > 0) {
            this.age = age;
        }
    }

    // 6. Phương thức toString()
    @Override // Đánh dấu là đang ghi đè phương thức của lớp cha (Object)
    public String toString() {
        return "Student[" +
                "masv='" + masv + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ']';
    }
}