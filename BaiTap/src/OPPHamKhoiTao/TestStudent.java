package OPPHamKhoiTao;
public class TestStudent {
    public static void main(String[] args) {
        // Sử dụng hàm khởi tạo mặc định
        Student sv1 = new Student();
        sv1.setMasv("001");
        sv1.setName("Nguyễn Văn A");
        sv1.setAge(20);

        // Sử dụng hàm khởi tạo có thuộc tính
        Student sv2 = new Student("002", "Trần Thị B", 21);

        // In thông tin dùng toString()
        System.out.println("Thông tin SV1: " + sv1);
        System.out.println("Thông tin SV2: " + sv2);

        // Sử dụng getter
        System.out.println("Tên của SV1 là: " + sv1.getName());
    }
}


