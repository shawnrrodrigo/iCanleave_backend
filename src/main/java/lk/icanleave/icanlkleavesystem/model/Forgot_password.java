package lk.icanleave.icanlkleavesystem.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Forgot_password {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String value;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_date",nullable = false)
    private Date createdTimeStamp = new Date(System.currentTimeMillis());

    @OneToOne
    @JoinColumn(name = "employee_id",referencedColumnName = "id")
    private Employee employee;
}
