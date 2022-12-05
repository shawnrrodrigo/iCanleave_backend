package lk.icanleave.icanlkleavesystem.service;
//resolving roleback issue
import lk.icanleave.icanlkleavesystem.model.AuditLog;
import lk.icanleave.icanlkleavesystem.repository.AuditLogRepository;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuditLogServiceImplementation implements AuditLogService{

    private final AuditLogRepository auditLogRepository;

    public AuditLogServiceImplementation(AuditLogRepository auditLogRepository){
        this.auditLogRepository=auditLogRepository;
    }

    @Override
    @Async
    public void createLog(AuditLog auditLog) {
        auditLogRepository.save(auditLog);
    }

    @Override
    public List<AuditLog> fetchAuditLog() {
        return null;
    }
}
