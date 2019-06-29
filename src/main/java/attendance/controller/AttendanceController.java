package attendance.controller;

import attendance.model.Attendance;
import attendance.repository.AttendanceRepository;
import attendance.vm.AttendanceCounterVM;
import attendance.vm.SingleStudentAttendanceVM;
import attendance.wrapper.AttendanceWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/attendance")
public class AttendanceController {

    @Autowired
    private AttendanceRepository attendanceRepository;

    @PostMapping("/take-attendance")
    public String takeAttendance(@RequestBody List<Attendance> attendances){
        for (Attendance attendance: attendances) {
            attendanceRepository.save(attendance);
        }
        return "Ok";
    }

    @GetMapping
    public List<Attendance> getAllAttendance() {
        return attendanceRepository.findAll();
    }

    @PostMapping("/single")
    public List<Attendance> getSingleStudentAttendance(
            @RequestBody SingleStudentAttendanceVM vm) {
        return attendanceRepository.findAllByStudentIdAndSubjectAndDateBetweenOrderByDateAsc(
                vm.getId(), vm.getSubject(), vm.getStart(), vm.getEnd());
    }
}
