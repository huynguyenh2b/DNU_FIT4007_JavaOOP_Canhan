package OOPCacPhuongThuc;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    // Constructors
    public Triangle() {}

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    // Getters/Setters (viết gộp)
    public double getSideA() { return sideA; }
    public double getSideB() { return sideB; }
    public double getSideC() { return sideC; }

    // --- CÁC PHƯƠNG THỨC MỚI (bao gồm setter gộp) ---

    /**
     * Setter gộp: thay đổi giá trị 3 cạnh cùng lúc.
     */
    public void set(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    /**
     * Phương thức nội bộ (private) kiểm tra 3 cạnh có hợp lệ không.
     */
    private boolean isValid() {
        return (sideA + sideB > sideC) &&
                (sideA + sideC > sideB) &&
                (sideB + sideC > sideA);
    }

    /**
     * Lấy chu vi tam giác.
     * @return Chu vi (double), hoặc -1 nếu không hợp lệ.
     */
    public double getPerimeter() {
        if (!isValid()) {
            return -1;
        }
        return sideA + sideB + sideC;
    }

    /**
     * Lấy diện tích tam giác (dùng công thức Heron).
     * @return Diện tích (double), hoặc -1 nếu không hợp lệ.
     */
    public double getArea() {
        if (!isValid()) {
            return -1;
        }
        double p = getPerimeter() / 2.0;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    /**
     * Kiểm tra tam giác cân.
     * @return true nếu cân, false nếu không.
     */
    public boolean isIsoscelesTriangle() {
        if (!isValid()) {
            return false;
        }
        // Dùng Math.abs để so sánh số thực
        return Math.abs(sideA - sideB) < 1e-9 ||
                Math.abs(sideB - sideC) < 1e-9 ||
                Math.abs(sideA - sideC) < 1e-9;
    }

    /**
     * Kiểm tra tam giác đều.
     * @return true nếu đều, false nếu không.
     */
    public boolean isEquilateralTriangle() {
        if (!isValid()) {
            return false;
        }
        return Math.abs(sideA - sideB) < 1e-9 &&
                Math.abs(sideB - sideC) < 1e-9;
    }

    /**
     * Kiểm tra tam giác vuông (dùng Pytago).
     * @return true nếu vuông, false nếu không.
     */
    public boolean isRightTriangle() {
        if (!isValid()) {
            return false;
        }
        double a2 = sideA * sideA;
        double b2 = sideB * sideB;
        double c2 = sideC * sideC;

        // Kiểm tra 3 trường hợp
        return Math.abs(a2 + b2 - c2) < 1e-9 ||
                Math.abs(a2 + c2 - b2) < 1e-9 ||
                Math.abs(b2 + c2 - a2) < 1e-9;
    }

    // toString
    @Override
    public String toString() {
        return "Triangle[" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                ']';
    }
}
