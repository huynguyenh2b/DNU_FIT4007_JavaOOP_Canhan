package OOPCacPhuongThuc;

public class TestGame {
    public static void main(String[] args) {
        Player p1 = new Player("Mario", 30, 80, 0, 0);
        Player p2 = new Player("Luigi", 28, 90, 1, 0);
        Game game = new Game(1, p1, p2);

        System.out.println(game);
        System.out.println("Người thắng: " + game.getWinner()); // null

        p2.increaseScore(20); // Luigi 110 điểm
        System.out.println("Người thắng: " + game.getWinner()); // Luigi

        game.resetGame();
        System.out.println("Điểm P1 sau reset: " + p1.getScore());
        System.out.println("Điểm P2 sau reset: " + p2.getScore());

        System.out.println("Game trước khi swap: " + game);
        game.swapPlayers();
        System.out.println("Game sau khi swap: " + game);
    }
}
