package lk.icanleave.icanlkleavesystem.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "team")
public class Team {
    @Id
    private String teamId;
    private String teamName;
    private String teamLeader;
    // recheck team
}
