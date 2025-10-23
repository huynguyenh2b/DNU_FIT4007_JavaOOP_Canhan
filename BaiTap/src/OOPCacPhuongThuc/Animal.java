package OOPCacPhuongThuc;

import java.util.Calendar;

public class Animal {
    private String name;
    private String color;
    private int age;

    // Constructors
    public Animal() {}
    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    // Getters/Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    // toString
    @Override
    public String toString() {
        return "Animal[name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age + ']';
    }

    // --- CÁC PHƯƠNG THỨC MỚI ---

    /**
     * Lấy năm sinh của động vật.
     */
    public int getYearOfBirth() {
        return Calendar.getInstance().get(Calendar.YEAR) - this.age;
    }

    /**
     * So sánh màu của động vật này với một động vật khác.
     * @param a Đối tượng Animal khác
     * @return true nếu cùng màu, false nếu khác.
     */
    public boolean equalsColor(Animal a) {
        // Phải kiểm tra null để tránh lỗi
        if (this.color == null || a.getColor() == null) {
            return false;
        }
        return this.color.equals(a.getColor());
    }

    /**
     * Tăng tuổi của động vật lên 1 (phương thức void).
     */
    public void increaseAge() {
        this.age++;
    }
}