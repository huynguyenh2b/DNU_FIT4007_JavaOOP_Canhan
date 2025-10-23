package OPPHamKhoiTao;
public class Circle {
    private double radius;

    // Hàm khởi tạo mặc định
    public Circle() {
        this.radius = 1.0;
    }

    // Hàm khởi tạo có thuộc tính
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter
    public double getRadius() {
        return radius;
    }

    // Setter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // toString
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ']';
    }
}
