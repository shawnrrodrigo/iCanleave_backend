package lk.icanleave.icanlkleavesystem.model;
//resolving roleback issue
//temp
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Permission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int permission_id;

    private String permission_name;
}
