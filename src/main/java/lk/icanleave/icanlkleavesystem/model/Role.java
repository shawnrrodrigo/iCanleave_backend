package lk.icanleave.icanlkleavesystem.model;

import lk.icanleave.icanlkleavesystem.model.customEnum.RoleStatus;
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
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roleId;

    private String roleName;

    private String createdBy;

    private Date createdDate;

    @Enumerated(EnumType.STRING)
    @Column(name="role_status")
    private RoleStatus status;
}
