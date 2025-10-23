package OOPCacPhuongThuc;

public class Product {
    private String name;
    private double price;
    private int quantity;

    // Constructors
    public Product() {}
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters/Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    // toString
    @Override
    public String toString() {
        return "Product[name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity + ']';
    }

    // --- CÁC PHƯƠNG THỨC MỚI ---

    /**
     * Lấy tổng giá trị (Giá * Số lượng).
     */
    public double getTotalPrice() {
        return this.price * this.quantity;
    }

    /**
     * Tăng số lượng lên 1.
     */
    public void increaseQuantity() {
        this.quantity++;
    }

    /**
     * Giảm số lượng xuống 1 (không cho phép âm).
     */
    public void decreaseQuantity() {
        if (this.quantity > 0) {
            this.quantity--;
        }
    }
}