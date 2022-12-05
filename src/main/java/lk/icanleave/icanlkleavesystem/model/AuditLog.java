package lk.icanleave.icanlkleavesystem.model;

import lk.icanleave.icanlkleavesystem.model.customEnum.ActionType;
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
public class AuditLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 5)
    private int createdBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date createdTimeStamp = new Date(System.currentTimeMillis());

    private String description;

    @Enumerated(EnumType.STRING)
    private ActionType actionType;
}
