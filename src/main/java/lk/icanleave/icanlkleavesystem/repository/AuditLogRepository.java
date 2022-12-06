package lk.icanleave.icanlkleavesystem.repository;

import lk.icanleave.icanlkleavesystem.model.AuditLog;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditLogRepository extends PagingAndSortingRepository<AuditLog, Long> {

}
