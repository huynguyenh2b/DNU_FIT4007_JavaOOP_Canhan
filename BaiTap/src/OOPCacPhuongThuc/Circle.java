package OOPCacPhuongThuc;

public class Circle {
    private double radius;

    // Constructors
    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter/Setter
    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    // toString
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ']';
    }

    // --- CÁC PHƯƠNG THỨC MỚI ---

    /**
     * Tính diện tích hình tròn.
     * @return Diện tích (double)
     */
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    /**
     * Tính chu vi (đường kính) hình tròn.
     * @return Chu vi (double)
     */
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
}
