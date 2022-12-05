package lk.icanleave.icanlkleavesystem.service;

import lk.icanleave.icanlkleavesystem.model.AuditLog;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface AuditLogService {
    void createLog(AuditLog auditLog);

    List<AuditLog> fetchAuditLog();

}
