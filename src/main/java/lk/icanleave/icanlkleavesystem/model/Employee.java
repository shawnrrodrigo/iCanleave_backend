package lk.icanleave.icanlkleavesystem.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="Employee")
public class Employee {
    @Id
    @Column(name ="emp_id")
    private String empId;

    @Column(name = "emp_name")
    private String empName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;
}
