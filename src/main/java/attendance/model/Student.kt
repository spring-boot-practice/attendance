package attendance.model

import javax.persistence.*

@Entity
data class Student(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long,
        var roll: Int,
        var registrationNumber: Long,
        var fullName: String,
        var email: String,
        var department: String,
        var semester: String
)