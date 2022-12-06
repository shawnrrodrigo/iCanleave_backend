package lk.icanleave.icanlkleavesystem.controller;

import lk.icanleave.icanlkleavesystem.model.AuditLog;
import lk.icanleave.icanlkleavesystem.model.Employee;
import lk.icanleave.icanlkleavesystem.model.customEnum.ActionType;
import lk.icanleave.icanlkleavesystem.service.AuditLogService;
import lk.icanleave.icanlkleavesystem.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

//@CrossOrigin("*")
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);
    private final AuditLogService auditLogService;
    private final EmployeeService employeeService;

    public EmployeeController(AuditLogService auditLogService, EmployeeService employeeService) {
        this.auditLogService = auditLogService;
        this.employeeService = employeeService;
    }

    @GetMapping()
    private String getAllEmployees(){
        AuditLog auditLog = new AuditLog();
        auditLog.setCreatedBy("1");
        auditLog.setDescription("This is a test");
        auditLog.setActionType(ActionType.INSERT);
        auditLogService.createLog(auditLog);
        LOGGER.info("This is a test 1");
        LOGGER.warn("This is a test 2");
        LOGGER.error("This is a test 3");
        LOGGER.info("This is a test 4");
        return "hello world";
    }

    @GetMapping("/get")
    @ResponseBody
    public Employee getEmployeeByID(){
        Employee employee = employeeService.getEmployeeById("123456789").get();
        System.out.println(employee.toString());
        return employee;
    }
}
