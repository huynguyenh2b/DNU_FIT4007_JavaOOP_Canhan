package OOPHamKhoiTao;

public class Game {
    private int id;
    private Player player1;
    private Player player2;

    // Hàm khởi tạo mặc định
    public Game() {
    }

    // Hàm khởi tạo có thuộc tính
    public Game(int id, Player player1, Player player2) {
        this.id = id;
        this.player1 = player1;
        this.player2 = player2;
    }

    // Getters
    public int getId() {
        return id;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    // toString
    @Override
    public String toString() {
        // Khi gọi 'player1' và 'player2' ở đây,
        // phương thức toString() của Player sẽ tự động được gọi
        return "Game[" +
                "id=" + id +
                ", player1=" + player1 +
                ", player2=" + player2 +
                ']';
    }
}
