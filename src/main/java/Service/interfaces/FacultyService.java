package Service.interfaces;

import Domain.Faculty;

public interface FacultyService {
    void saveFaculty(Faculty faculty);
    Faculty getFaculty(String email);
    void deleteFaculty(String email);
    boolean updateFaculty(Faculty faculty);
}
