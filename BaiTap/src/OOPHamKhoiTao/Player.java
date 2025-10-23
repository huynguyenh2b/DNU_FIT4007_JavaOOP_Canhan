package OOPHamKhoiTao;

public class Player {
    private String name;
    private int age;
    private int positionX;
    private int positionY;

    // Hàm khởi tạo mặc định
    public Player() {
        this.positionX = 0;
        this.positionY = 0;
    }

    // Hàm khởi tạo có thuộc tính
    public Player(String name, int age, int positionX, int positionY) {
        this.name = name;
        this.age = age;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    // toString
    @Override
    public String toString() {
        return "Player[" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", position=(" + positionX +
                ", " + positionY + ')' +
                ']';
    }
}
