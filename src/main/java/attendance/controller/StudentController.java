package attendance.controller;

import attendance.model.Student;
import attendance.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/all_students")
    public List<Student> getAllStudentByDepartmentAndSemester(
            @RequestParam("department") String department, @RequestParam("semester") String semester) {
        return studentRepository.findAllByDepartmentAndSemesterOrderByRollAsc(department, semester);
    }
}
