package attendance.wrapper

import attendance.model.Attendance

data class AttendanceWrapper (
    var attendances: List<Attendance> = emptyList()
)
