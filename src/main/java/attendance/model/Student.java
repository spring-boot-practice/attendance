package attendance.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int roll;

    private Long registrationNumber;

    private String fullName;

    private String email;

    private String department;

    private String semester;
}
