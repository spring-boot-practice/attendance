package attendance.repository;

import attendance.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findAllByDepartmentAndSemesterOrderByRollAsc(
            String department, String semester);
}
