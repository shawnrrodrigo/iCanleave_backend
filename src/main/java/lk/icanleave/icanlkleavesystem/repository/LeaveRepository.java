package lk.icanleave.icanlkleavesystem.repository;

import lk.icanleave.icanlkleavesystem.model.Leave;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaveRepository extends JpaRepository<Leave, String> {

}
