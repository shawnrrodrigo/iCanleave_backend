package lk.icanleave.icanlkleavesystem.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "Leave_record")
public class LeaveRecord {
    @Id
    private String leaveId;
    private Enum session;
    private String note;
    @Temporal(TemporalType.DATE)
    @Column(name = "joined_date")
    private Date requestedDate = new Date(System.currentTimeMillis());
    @Temporal(TemporalType.DATE)
    @Column(name = "created_date")
    private Date createdDate = new Date(System.currentTimeMillis());
    @Temporal(TemporalType.DATE)
    @Column(name = "handled_date")
    private Date handledDate = new Date(System.currentTimeMillis());
    private String requestFeedback;
    private Date startDate;
    private Date endDate;
    private String medicalForm;
    private Date shortleaveTime;
    private Enum leaveType;

    private String requestedBy;
    private String handledBy;


}
