package lk.icanleave.icanlkleavesystem.model;

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
    private int employee_id;

    @Column(name = "leave_id")
    private int leave_id;
}
