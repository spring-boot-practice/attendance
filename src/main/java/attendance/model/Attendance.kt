package attendance.model

import com.fasterxml.jackson.annotation.JsonFormat
import lombok.Data

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import java.time.Instant

@Entity
data class Attendance(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long,
        var studentId: Long,
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC+6")
        var date: Instant,
        var roll: Int,
        var status: String,
        var department: String,
        var semester: String,
        var subject: String
)
