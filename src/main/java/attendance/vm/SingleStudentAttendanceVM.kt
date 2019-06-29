package attendance.vm

import com.fasterxml.jackson.annotation.JsonFormat
import java.time.Instant

data class SingleStudentAttendanceVM (
        var id: Long,
        var subject: String,
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC+6")
        var start: Instant,
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC+6")
        var end: Instant
)
