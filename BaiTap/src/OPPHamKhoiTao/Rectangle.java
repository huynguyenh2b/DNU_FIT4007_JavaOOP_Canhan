package OPPHamKhoiTao;

public class Rectangle {
    private double width;
    private double height;

    // Hàm khởi tạo mặc định
    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }

    // Hàm khởi tạo có thuộc tính
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Getters
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // Setters
    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // toString
    @Override
    public String toString() {
        return "Rectangle[" +
                "width=" + width +
                ", height=" + height +
                ']';
    }
}