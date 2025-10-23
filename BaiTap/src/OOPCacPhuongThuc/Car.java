package OOPCacPhuongThuc;

import java.util.Calendar;

public class Car {
    private String color;
    private String name;
    private int seatingCapacity;
    private int year; // Năm sản xuất

    // Constructors
    public Car() {}
    public Car(String color, String name, int seatingCapacity, int year) {
        this.color = color;
        this.name = name;
        this.seatingCapacity = seatingCapacity;
        this.year = year;
    }

    // Getters/Setters
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getSeatingCapacity() { return seatingCapacity; }
    public void setSeatingCapacity(int seatingCapacity) { this.seatingCapacity = seatingCapacity; }
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    // toString
    @Override
    public String toString() {
        return "Car[name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year + ']';
    }

    // --- PHƯƠNG THỨC MỚI ---

    /**
     * Lấy "tuổi thọ" của xe (Năm hiện tại - Năm sản xuất).
     */
    public int getAge() {
        return Calendar.getInstance().get(Calendar.YEAR) - this.year;
    }
}
