package OOPHamKhoiTao;

public class Product {
    private String name;
    private double price;
    private int quantity;

    // Hàm khởi tạo mặc định
    public Product() {
    }

    // Hàm khởi tạo có thuộc tính
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // toString
    @Override
    public String toString() {
        return "Product[" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ']';
    }
}
