package OOPCacPhuongThuc;

public class TestAnimal {
    public static void main(String[] args) {
        Animal dog = new Animal("Buddy", "Vàng", 3);
        Animal cat = new Animal("Miu", "Trắng", 2);
        Animal bird = new Animal("Vet", "Vàng", 1);

        System.out.println(dog);
        System.out.println("Năm sinh của Buddy: " + dog.getYearOfBirth());

        // Test so sánh màu
        System.out.println("Chó và Mèo cùng màu? " + dog.equalsColor(cat));
        System.out.println("Chó và Vẹt cùng màu? " + dog.equalsColor(bird));

        // Test tăng tuổi
        System.out.println("Tuổi Mèo trước khi tăng: " + cat.getAge());
        cat.increaseAge();
        System.out.println("Tuổi Mèo sau khi tăng: " + cat.getAge());
    }
}