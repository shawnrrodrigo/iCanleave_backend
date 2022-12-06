package lk.icanleave.icanlkleavesystem.model;
//resolving roleback issue
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Embeddable
public class LeaveWalletKey implements Serializable {
    @Column(name = "employee_id",length = 5)
    private String employee_id;

    @Column(name = "leave_id")
    private int leave_id;
}
