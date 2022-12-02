package lk.icanleave.icanlkleavesystem.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LeaveWallet {
    @EmbeddedId
    private LeaveWalletKey id;

    @ManyToOne
    @MapsId("employee_id")
    @JoinColumn(name = "emplyee_id")
    private Employee employee;

    @ManyToOne
    @MapsId("leave_id")
    @JoinColumn(name= "leave_type_id")
    private Leave_Type leaveType;

    @Column(name = "leave_count",precision = 3, scale = 1)
    private  double value;
}
