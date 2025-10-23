package OOPCacPhuongThuc;

public class TestProduct {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 20000, 5);

        System.out.println(p1);
        System.out.println("Tổng giá trị: " + p1.getTotalPrice());

        p1.increaseQuantity(); // Tăng lên 6
        System.out.println("Số lượng sau khi tăng: " + p1.getQuantity());

        p1.decreaseQuantity(); // Giảm về 5
        p1.decreaseQuantity(); // Giảm về 4
        System.out.println("Số lượng sau khi giảm: " + p1.getQuantity());
    }
}
