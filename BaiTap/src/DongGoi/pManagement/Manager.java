package DongGoi.pManagement;

public class Manager {

    public void reviewEmployeePerformance(Employee emp) {
        System.out.println("--- Manager Review (cùng package) ---");

        // 1. Truy cập PRIVATE (Ví dụ 1)
        // emp.salary = 10000; // LỖI! Không thể truy cập 'salary' vì là private.

        // 2. Truy cập DEFAULT (Ví dụ 2)
        // Có thể truy cập vì 'Manager' cùng package 'pManagement'.
        emp.giveRaise(500);

        // 3. Truy cập PROTECTED (Ví dụ 3)
        // Có thể truy cập vì 'Manager' cùng package 'pManagement'.
        double bonus = emp.calculateBonusBase();
        System.out.println("Thưởng cơ bản của nhân viên: " + bonus);

        // 4. Truy cập PUBLIC (Ví dụ 4)
        // Có thể truy cập từ bất cứ đâu.
        emp.setSalary(7000);
        System.out.println("Lương hiện tại (get): " + emp.getSalary());
    }
}
