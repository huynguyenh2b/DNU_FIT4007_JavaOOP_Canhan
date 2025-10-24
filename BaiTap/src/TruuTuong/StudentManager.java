package TruuTuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentManager implements IManager {
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

    // --- Triển khai (implement) các phương thức của Interface ---

    @Override
    public void addStudent(Student student) {
        // Kiểm tra trùng lặp masv
        if (findStudent(student.getMasv()) != null) {
            System.out.println("Lỗi: Mã sinh viên " + student.getMasv() + " đã tồn tại.");
        } else {
            this.students.add(student);
            System.out.println("Thêm sinh viên thành công.");
        }
    }

    @Override
    public void editStudent(String masv, Student newStudent) {
        Student oldStudent = findStudent(masv);
        if (oldStudent != null) {
            // Tìm vị trí của sinh viên cũ và thay thế bằng sinh viên mới
            int index = students.indexOf(oldStudent);
            students.set(index, newStudent);
            System.out.println("Cập nhật thành công.");
        } else {
            System.out.println("Không tìm thấy sinh viên với mã " + masv);
        }
    }

    @Override
    public void removeStudent(String masv) {
        Student student = findStudent(masv);
        if (student != null) {
            students.remove(student);
            System.out.println("Xoá sinh viên thành công.");
        } else {
            System.out.println("Không tìm thấy sinh viên với mã " + masv);
        }
    }

    @Override
    public Student findStudent(String masv) {
        for (Student s : students) {
            if (s.getMasv().equalsIgnoreCase(masv)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public void sortByAge() {
        // Sắp xếp không giảm (tăng dần)
        Collections.sort(students, Comparator.comparingInt(Student::getAge));
        System.out.println("Đã sắp xếp danh sách theo tuổi.");
    }

    @Override
    public void sortByScore() {
        // Sắp xếp không giảm (tăng dần)
        Collections.sort(students, Comparator.comparingDouble(Student::calculateAverage));
        System.out.println("Đã sắp xếp danh sách theo điểm trung bình.");
    }

    @Override
    public ArrayList<Student> findStudent(int age) {
        ArrayList<Student> results = new ArrayList<>();
        for (Student s : students) {
            if (s.getAge() == age) {
                results.add(s);
            }
        }
        return results;
    }

    @Override
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("Danh sách sinh viên trống.");
            return;
        }
        System.out.println("--- Danh sách Sinh viên ---");
        for (Student s : students) {
            // Tính đa hình: s.toString() sẽ tự động gọi
            // toString() của StudentIT hoặc StudentBA
            System.out.println(s.toString());
        }
    }
}
