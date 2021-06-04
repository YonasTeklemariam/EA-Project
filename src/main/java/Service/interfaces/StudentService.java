package Service.interfaces;

import Domain.Student;

public interface StudentService {
    void saveStudent(Student student);
    Student getStudent(String id);
    void deleteStudent(String id);
    boolean updateStudent(Student student);
}
