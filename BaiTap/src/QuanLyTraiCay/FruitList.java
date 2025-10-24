package QuanLyTraiCay;

import java.util.ArrayList;

public class FruitList {
    private ArrayList<Fruit> list;

    public FruitList() {
        this.list = new ArrayList<>();
    }

    // Hàm hỗ trợ: Tìm trái cây theo ID (để kiểm tra trùng lặp)
    public Fruit findById(int id) {
        for (Fruit f : list) {
            if (f.getId() == id) {
                return f;
            }
        }
        return null;
    }

    /**
     * 1. Thêm Fruit (In hoặc Out) vào danh sách
     */
    public void addFruit(Fruit f) {
        // Kiểm tra ID trùng lặp
        if (findById(f.getId()) != null) {
            System.out.println("Lỗi: ID " + f.getId() + " đã tồn tại. Không thể thêm.");
        } else {
            list.add(f);
            System.out.println("Thêm trái cây thành công.");
        }
    }

    /**
     * 2. In ra danh sách Fruit
     */
    public void printList() {
        if (list.isEmpty()) {
            System.out.println("Danh sách trái cây trống.");
            return;
        }
        System.out.println("--- Danh sách Trái cây ---");
        for (Fruit f : list) {
            // TÍNH ĐA HÌNH: Tự động gọi toString() của FruitIn hoặc FruitOut
            System.out.println(f.toString());
        }
    }

    /**
     * 3. In danh sách FruitIn và FruitOut có priceForSale > 20
     */
    public void printListPriceOver20() {
        System.out.println("--- Danh sách Trái cây có giá bán > 20 ---");
        int count = 0;
        for (Fruit f : list) {
            // TÍNH ĐA HÌNH: Tự động gọi priceForSale() của FruitIn hoặc FruitOut
            if (f.priceForSale() > 20) {
                System.out.println(f.toString());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không tìm thấy trái cây nào có giá bán > 20.");
        }
    }

    /**
     * 4. Tính tổng số Fruit có trong danh sách
     */
    public int getTotalCount() {
        return list.size();
    }
}