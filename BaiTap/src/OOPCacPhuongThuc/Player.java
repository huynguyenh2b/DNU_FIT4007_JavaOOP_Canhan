package OOPCacPhuongThuc;

public class Player {
    private String name;
    private int age;
    private int score; // Đã thêm score
    private int positionX;
    private int positionY;

    // Constructors
    public Player() {
        this.score = 0; // Mặc định điểm = 0
    }

    public Player(String name, int age, int score, int positionX, int positionY) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    // Getters/Setters (Bao gồm cả score)
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public int getScore() { return score; }
    public void setScore(int score) { this.score = score; }
    public int getPositionX() { return positionX; }
    public void setPositionX(int positionX) { this.positionX = positionX; }
    public int getPositionY() { return positionY; }
    public void setPositionY(int positionY) { this.positionY = positionY; }

    // toString (Bao gồm cả score)
    @Override
    public String toString() {
        return "Player[name='" + name + '\'' +
                ", score=" + score +
                ", pos=(" + positionX + ", " + positionY + ')' +
                ']';
    }

    // --- CÁC PHƯƠNG THỨC MỚI ---

    /**
     * Tăng điểm lên 1.
     */
    public void increaseScore() {
        this.score++;
    }

    /**
     * Giảm điểm xuống 1 (không âm).
     */
    public void decreaseScore() {
        if (this.score > 0) {
            this.score--;
        }
    }

    /**
     * Tăng điểm lên n (Nạp chồng phương thức - Overloading).
     * @param n Số điểm cần tăng
     */
    public void increaseScore(int n) {
        this.score += n;
    }

    /**
     * Giảm điểm xuống n (Nạp chồng phương thức - Overloading).
     * @param n Số điểm cần giảm
     */
    public void decreaseScore(int n) {
        this.score -= n;
        if (this.score < 0) {
            this.score = 0; // Đảm bảo điểm không bao giờ âm
        }
    }

    /**
     * Kiểm tra thắng (điểm >= 100).
     */
    public boolean isWinner() {
        return this.score >= 100;
    }
}