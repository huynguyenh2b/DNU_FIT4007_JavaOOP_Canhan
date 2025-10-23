package OOPCacPhuongThuc;

public class TestCar {
    public static void main(String[] args) {
        // Giả sử năm hiện tại là 2024
        Car car1 = new Car("Đỏ", "Vinfast VF8", 5, 2022);

        System.out.println(car1);
        System.out.println("Tuổi thọ của xe: " + car1.getAge() + " năm");
    }
}
