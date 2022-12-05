package lk.icanleave.icanlkleavesystem.repository;

import lk.icanleave.icanlkleavesystem.model.AuditLog;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AuditLogRepository extends PagingAndSortingRepository<AuditLog, Long> {

}
