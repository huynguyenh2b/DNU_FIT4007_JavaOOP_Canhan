package OPPHamKhoiTao;

public class Animal {
    private String name;
    private String color;
    private int age;

    // Hàm khởi tạo mặc định
    public Animal() {
    }

    // Hàm khởi tạo có thuộc tính
    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // toString
    @Override
    public String toString() {
        return "Animal[" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ']';
    }
}

