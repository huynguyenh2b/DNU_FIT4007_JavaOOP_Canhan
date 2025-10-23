package OOPCacPhuongThuc;

public class TestPlayer {
    public static void main(String[] args) {
        Player p1 = new Player("Hero", 25, 90, 0, 0);
        System.out.println(p1);

        p1.increaseScore(); // Tăng 1 -> 91
        System.out.println("Điểm: " + p1.getScore());

        p1.increaseScore(10); // Tăng 10 -> 101
        System.out.println("Điểm: " + p1.getScore());

        System.out.println("Thắng? " + p1.isWinner());

        p1.decreaseScore(102); // Giảm 102 -> về 0
        System.out.println("Điểm: " + p1.getScore());
        System.out.println("Thắng? " + p1.isWinner());
    }
}
