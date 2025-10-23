package DongGoi.pHR;

import DongGoi.pManagement.Employee; // Phải import vì khác package

// 'HRSpecialist' là một 'Employee' (kế thừa)
public class HRSpecialist extends Employee {

    public HRSpecialist(int initialSalary) {
        // Gọi constructor của class cha (Employee)
        super(initialSalary);
    }

    public void processPayroll() {
        System.out.println("--- HR Process (khác package, là subclass) ---");

        // 1. Truy cập PRIVATE (Ví dụ 1)
        // this.salary = 9000; // LỖI! Không thể truy cập 'salary' vì là private.

        // 2. Truy cập DEFAULT (Ví dụ 2)
        // this.giveRaise(200); // LỖI! Không thể truy cập 'giveRaise'
        // vì nó là 'default' và HRSpecialist ở package khác.

        // 3. Truy cập PROTECTED (Ví dụ 3)
        // Có thể truy cập vì 'HRSpecialist' là subclass của 'Employee'.
        double bonus = this.calculateBonusBase();
        System.out.println("HR tính thưởng cơ bản: " + bonus);

        // 4. Truy cập PUBLIC (Ví dụ 4)
        // Có thể truy cập từ bất cứ đâu.
        this.setSalary(8000);
        System.out.println("Lương hiện tại (get): " + this.getSalary());
    }
}
