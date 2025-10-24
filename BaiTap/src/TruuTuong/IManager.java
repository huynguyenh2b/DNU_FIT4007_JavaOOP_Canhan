package TruuTuong;

import java.util.ArrayList;

public interface IManager {
    void addStudent(Student student);
    void editStudent(String masv, Student student);
    void removeStudent(String masv);
    Student findStudent(String masv);
    void sortByAge();
    void sortByScore();
    ArrayList<Student> findStudent(int age); // Nạp chồng (overload)
    void displayAllStudents();
}
