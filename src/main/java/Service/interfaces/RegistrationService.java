package Service.interfaces;

import Domain.CourseOffering;
import Domain.Registration;
import Domain.Student;

public interface RegistrationService {
    void saveRegistration(CourseOffering courseOffering, Student student);
    Registration getRegistration(Student student);
    void deleteRegistration(Student student);
    boolean updateRegistration(Student student);
}
