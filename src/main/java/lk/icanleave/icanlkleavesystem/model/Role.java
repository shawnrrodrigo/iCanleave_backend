package lk.icanleave.icanlkleavesystem.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    private String roleId;
    private String roleName;
    private String createdBy;
    private Date createdDate;
    private Enum status;
}
