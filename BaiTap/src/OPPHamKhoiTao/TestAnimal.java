package OPPHamKhoiTao;

public class TestAnimal {
    public static void main(String[] args) {
        Animal dog = new Animal("Buddy", "Vàng", 3);
        Animal cat = new Animal();
        cat.setName("Miu");
        cat.setColor("Trắng");
        cat.setAge(2);

        System.out.println(dog);
        System.out.println(cat);
    }
}