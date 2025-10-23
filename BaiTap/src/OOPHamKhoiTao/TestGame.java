package OOPHamKhoiTao;

public class TestGame {
    public static void main(String[] args) {
        // 1. Tạo 2 đối tượng Player trước
        Player p1 = new Player("Mario", 30, 0, 0);
        Player p2 = new Player("Luigi", 28, 10, 0);

        // 2. Tạo đối tượng Game, truyền 2 Player vào
        Game superMario = new Game(1, p1, p2);

        // 3. In ra thông tin Game
        System.out.println(superMario);
    }
}
