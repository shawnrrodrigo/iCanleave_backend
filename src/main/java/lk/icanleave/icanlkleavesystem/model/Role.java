package lk.icanleave.icanlkleavesystem.model;
//resolving roleback issue
import lk.icanleave.icanlkleavesystem.model.customEnum.RoleStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "created_by",referencedColumnName = "id")
    private Employee employee;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date createdTimeStamp = new Date(System.currentTimeMillis());

    @Enumerated(EnumType.STRING)
    @Column(name="role_status")
    private RoleStatus status;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "role", orphanRemoval = true, targetEntity = Employee.class)
    private List<Employee> employeeList = new ArrayList<>();
}
