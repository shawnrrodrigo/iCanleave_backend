package lk.icanleave.icanlkleavesystem.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Data
@Entity
@Table(name="Employee")
public class Employee {
    @Id
    @Column(name ="emp_id")
    private String empId;

    @Column(name = "emp_name")
    private String empName;

    @Column(name = "date_of_birth")
    private LocalDate dob;

    @Column(name = "email")
    private String email;

    @Temporal(TemporalType.DATE)
    @Column(name = "joined_date")
    private Date joinedDate = new Date(System.currentTimeMillis());

    @Column(name = "phone")
    private String phone;

    @Column(name = "position")
    private Enum position;

    @Column(name = "ref_person") //emergency contact person
    private String referencePerson;

    @Column(name = "ref_per_contact")
    private String refPersonContact;

    @Column(name = "team_leader")
    private String teamLeader;
}
