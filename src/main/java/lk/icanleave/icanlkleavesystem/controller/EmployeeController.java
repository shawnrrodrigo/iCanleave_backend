package lk.icanleave.icanlkleavesystem.controller;

import lk.icanleave.icanlkleavesystem.model.AuditLog;
import lk.icanleave.icanlkleavesystem.model.customEnum.ActionType;
import lk.icanleave.icanlkleavesystem.service.AuditLogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

//@CrossOrigin("*")
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);
    private final AuditLogService auditLogService;

    public EmployeeController(AuditLogService auditLogService) {
        this.auditLogService = auditLogService;
    }

    @GetMapping()
    private String getAllEmployees(){
        AuditLog auditLog = new AuditLog();
        auditLog.setCreatedBy(1);
        auditLog.setDescription("This is a test");
        auditLog.setActionType(ActionType.INSERT);
        auditLogService.createLog(auditLog);
        LOGGER.info("This is a test 1");
        LOGGER.warn("This is a test 2");
        LOGGER.error("This is a test 3");
        LOGGER.info("This is a test 4");
        return "hello world";
    }

    private void saveLog(){

    }
}
