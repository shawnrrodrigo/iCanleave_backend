package lk.icanleave.icanlkleavesystem.model;
//resolving roleback issue
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
public class Emergency_contact_person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String first_name;
    private  String last_name;

    @Column(length = 15)
    private String telephone_number;

    @OneToOne
    private Employee employee;
}
