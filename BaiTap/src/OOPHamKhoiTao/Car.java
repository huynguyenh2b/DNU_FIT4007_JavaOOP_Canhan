package OOPHamKhoiTao;

public class Car {
    private String color;
    private String name;
    private int seatingCapacity;
    private int year;

    // Hàm khởi tạo mặc định
    public Car() {
    }

    // Hàm khởi tạo có thuộc tính
    public Car(String color, String name, int seatingCapacity, int year) {
        this.color = color;
        this.name = name;
        this.seatingCapacity = seatingCapacity;
        this.year = year;
    }

    // Getters
    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public int getYear() {
        return year;
    }

    // Setters
    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // toString
    @Override
    public String toString() {
        return "Car[" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", seatingCapacity=" + seatingCapacity +
                ", year=" + year +
                ']';
    }
}
