package OPPHamKhoiTao;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(); // Mặc định 1.0, 1.0
        Rectangle rect2 = new Rectangle(10.5, 5.2); // Có tham số

        System.out.println("Hình 1: " + rect1);
        System.out.println("Hình 2: " + rect2);

        rect1.setWidth(7);
        System.out.println("Chiều rộng mới của Hình 1: " + rect1.getWidth());
        System.out.println("Thông tin Hình 1 sau khi set: " + rect1);
    }
}