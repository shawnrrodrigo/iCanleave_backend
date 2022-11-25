package lk.icanleave.icanlkleavesystem.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "team")
public class Team {
    @Id
    private String teamId;
    private String teamName;
    private String teamLeader;
}
