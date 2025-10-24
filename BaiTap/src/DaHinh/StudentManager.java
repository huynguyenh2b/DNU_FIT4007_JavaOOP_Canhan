package DaHinh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentManager {
    private ArrayList<Student> students;

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    public StudentManager(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    // --- Nạp chồng (Overloading) ---
    public boolean addStudent(Student s) {
        // Kiểm tra trùng lặp ID
        for (Student stu : students) {
            if (stu.getStudentID().equalsIgnoreCase(s.getStudentID())) {
                System.out.println("Lỗi: Mã sinh viên " + s.getStudentID() + " đã tồn tại.");
                return false;
            }
        }
        this.students.add(s);
        return true;
    }

    public void addStudent(ArrayList<Student> s) {
        for (Student stu : s) {
            this.addStudent(stu); // Gọi lại phương thức add từng sinh viên để kiểm tra
        }
    }
    // ---------------------------------

    public void showStudents() {
        if (students.isEmpty()) {
            System.out.println("Danh sách sinh viên trống.");
            return;
        }
        System.out.println("--- Danh sách Sinh viên ---");
        for (Student s : students) {
            // TÍNH ĐA HÌNH: s.toString() sẽ tự động gọi
            // toString() của StudentIT hoặc StudentBA
            System.out.println(s.toString());
        }
    }

    // --- Nạp chồng (Overloading) ---
    public boolean deleteStudent(Student s) {
        return this.students.remove(s); // Dựa trên phương thức equals() đã ghi đè
    }

    public boolean deleteStudent(String studentID) {
        Student s = searchStudent(studentID);
        if (s != null) {
            return this.students.remove(s);
        }
        return false;
    }
    // ---------------------------------

    // --- Nạp chồng (Overloading) ---
    public boolean updateStudent(Student s) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentID().equalsIgnoreCase(s.getStudentID())) {
                students.set(i, s);
                return true;
            }
        }
        return false;
    }

    public boolean updateStudent(String studentID, Student s) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentID().equalsIgnoreCase(studentID)) {
                students.set(i, s);
                return true;
            }
        }
        return false;
    }
    // ---------------------------------

    // --- Nạp chồng (Overloading) ---
    public Student searchStudent(String studentID) {
        for (Student s : students) {
            if (s.getStudentID().equalsIgnoreCase(studentID)) {
                return s;
            }
        }
        return null;
    }

    public Student searchStudent(Student s) {
        return searchStudent(s.getStudentID());
    }
    // ---------------------------------

    public void sortByScore() {
        Collections.sort(this.students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                // TÍNH ĐA HÌNH: Tự động gọi calculateAverage() tương ứng
                return Float.compare(s1.calculateAverage(), s2.calculateAverage());
            }
        });
        System.out.println("Đã sắp xếp theo điểm trung bình tăng dần.");
    }

    public void sortByAge() {
        Collections.sort(this.students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.getAge(), s2.getAge());
            }
        });
        System.out.println("Đã sắp xếp theo tuổi tăng dần.");
    }

    public void sortByID() {
        Collections.sort(this.students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getStudentID().compareTo(s2.getStudentID());
            }
        });
        System.out.println("Đã sắp xếp theo Mã SV tăng dần.");
    }

    public void SortByType() {
        Collections.sort(this.students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                // Sinh viên IT (s1) lên trước BA (s2)
                if (s1 instanceof StudentIT && s2 instanceof StudentBA) {
                    return -1;
                }
                // Sinh viên BA (s1) xuống sau IT (s2)
                if (s1 instanceof StudentBA && s2 instanceof StudentIT) {
                    return 1;
                }
                // Cùng loại thì không đổi
                return 0;
            }
        });
        System.out.println("Đã sắp xếp: Sinh viên IT lên trước, BA xuống sau.");
    }
}