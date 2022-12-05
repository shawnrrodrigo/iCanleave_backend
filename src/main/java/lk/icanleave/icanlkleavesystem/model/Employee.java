package lk.icanleave.icanlkleavesystem.model;
//resolving roleback issue
import lk.icanleave.icanlkleavesystem.model.customEnum.UserStatus;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 5)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private LocalDate dob;

    @Column(nullable = false)
    private String email;

    private String password;

    @Column(nullable = false,length = 14)
    private String phone;

    @Enumerated(EnumType.STRING)
    private UserStatus status;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date joinedDate = new Date(System.currentTimeMillis());

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date createdTimeStamp = new Date(System.currentTimeMillis());

    @ManyToOne
    @JoinColumn(name = "created_by",  referencedColumnName = "id")
    private Employee createdBy;

    @ManyToOne
    @JoinColumn(name = "terminated_by",  referencedColumnName = "id")
    private Employee terminatedBy;

    @Temporal(TemporalType.DATE)
    @Column(nullable = true)
    private Date terminatedDate = null;

    @Column(nullable = true)
    private String otp = null;

    @ManyToOne
    @JoinColumn(name = "team",  referencedColumnName = "id")
    private Team team;

    @ManyToOne
    @JoinColumn(name = "role",  referencedColumnName = "id")
    private Role role;

    @Column(nullable = true)
    private String solt;
}
