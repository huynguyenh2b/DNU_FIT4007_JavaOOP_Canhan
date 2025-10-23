package OOPCacPhuongThuc;
public class Game {
    private int id;
    private Player player1;
    private Player player2;

    // Constructors
    public Game() {}
    public Game(int id, Player player1, Player player2) {
        this.id = id;
        this.player1 = player1;
        this.player2 = player2;
    }

    // Getters/Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public Player getPlayer1() { return player1; }
    public void setPlayer1(Player player1) { this.player1 = player1; }
    public Player getPlayer2() { return player2; }
    public void setPlayer2(Player player2) { this.player2 = player2; }

    // toString
    @Override
    public String toString() {
        return "Game[id=" + id +
                ", player1=" + player1.getName() + // Chỉ lấy tên cho gọn
                ", player2=" + player2.getName() +
                ']';
    }

    // --- CÁC PHƯƠNG THỨC MỚI ---

    /**
     * Lấy người chiến thắng.
     * @return Player thắng, hoặc null nếu chưa ai thắng.
     */
    public Player getWinner() {
        // Ưu tiên Player 1 nếu cả 2 cùng thắng
        if (player1.isWinner()) {
            return player1;
        }
        if (player2.isWinner()) {
            return player2;
        }
        return null; // Cả 2 chưa thắng
    }

    /**
     * Thiết lập lại điểm của 2 người chơi về 0.
     */
    public void resetGame() {
        player1.setScore(0);
        player2.setScore(0);
    }

    /**
     * Hoán đổi vị trí của 2 người chơi.
     */
    public void swapPlayers() {
        Player temp = this.player1;
        this.player1 = this.player2;
        this.player2 = temp;
    }
}
