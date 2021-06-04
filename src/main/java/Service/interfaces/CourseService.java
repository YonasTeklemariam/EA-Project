package Service.interfaces;

import Domain.Course;

public interface CourseService {
    void saveCourse(Course course);
    Course getCourse(String code);
    void deleteCourse(String code);
    boolean updateCourse(Course course);
}
