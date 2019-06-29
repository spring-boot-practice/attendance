package attendance.repository;

import attendance.model.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.Instant;
import java.util.List;

public interface AttendanceRepository extends JpaRepository<Attendance, Long> {

    List<Attendance> findAllByDepartmentAndSemesterAndSubjectAndDateBetweenOrderByRollAsc(
            String department, String semester, String subject, Instant start, Instant end);

    List<Attendance> findAllByStudentIdAndSubjectAndDateBetweenOrderByDateAsc(
            Long studentId, String subject, Instant start, Instant end);
    
    int countAllByStudentIdAndStatusAndDateBetween(Long studentId, String status, Instant start, Instant end);
}
