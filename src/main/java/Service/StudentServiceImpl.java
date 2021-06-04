package Service;

import Domain.Student;
import Repository.StudentRepo;
import Service.interfaces.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepo studentRepo;

    @Override
    public void saveStudent(Student student) {
        if(null != student){
            if(!studentRepo.existsByStudentId(student.getStudentId())){
                studentRepo.save(student);
            }
        }
    }

    @Override
    public Student getStudent(String  id) {
        if(null != id){
            if(studentRepo.existsByStudentId(id)){
                return studentRepo.findByStudentId(id);
            }
        }
        return null;
    }

    @Override
    public void deleteStudent(String id) {
        if(null != id){
            if(studentRepo.existsByStudentId(id)){
                studentRepo.delete(studentRepo.findByStudentId(id));
            }
        }
    }

    @Override
    public boolean updateStudent(Student student) {
        return false;
    }
}
