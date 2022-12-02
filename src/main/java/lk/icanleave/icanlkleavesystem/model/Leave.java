package lk.icanleave.icanlkleavesystem.model;

import lk.icanleave.icanlkleavesystem.model.customEnum.LeaveSession;
import lk.icanleave.icanlkleavesystem.model.customEnum.LeaveStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "Leave_record")
public class Leave {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int leaveId;

    @ManyToOne
    @JoinColumn(name = "requested_by", referencedColumnName = "id")
    private Employee employee;

    @Enumerated(EnumType.STRING)
    @Column(name="session")
    private LeaveSession status;

    private String note;

    @Enumerated
    @Column(name = "status")
    private LeaveStatus leaveStatus;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date createdTimeStamp = new Date(System.currentTimeMillis());

    @Temporal(TemporalType.DATE)
    @Column(nullable = true)
    private Date handledDate = null;

    private String requestFeedbackNote;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date startedDate;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date endDate;

    @Column(nullable = true)
    private String medicalForm = null;

    @Temporal(TemporalType.TIME)
    @Column(nullable = true)
    private Date  startedTime = null;

    @Temporal(TemporalType.TIME)
    @Column(nullable = true)
    private Date  endTime = null;

    @ManyToOne
    @JoinColumn(name = "leave_type",referencedColumnName = "leave_type_id")
    private Leave_Type leaveType;

    @ManyToOne
    @JoinColumn(name = "handled_by", referencedColumnName = "id")
    private Employee handler;
}
