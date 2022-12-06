package lk.icanleave.icanlkleavesystem.controller;

import lk.icanleave.icanlkleavesystem.Response.ResponseHandler;
import lk.icanleave.icanlkleavesystem.model.AuditLog;
import lk.icanleave.icanlkleavesystem.model.Employee;
import lk.icanleave.icanlkleavesystem.model.customEnum.ActionType;
import lk.icanleave.icanlkleavesystem.service.AuditLogService;
import lk.icanleave.icanlkleavesystem.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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
    private ResponseEntity<Object> getAllEmployee(){
        List<Employee> result = employeeService.getAllEmployee();
        return ResponseHandler.generateResponse("Successfully retrieved data!", HttpStatus.OK, result);
    }

    private String getAllEmployees1(){

        AuditLog auditLog = new AuditLog();
        auditLog.setCreatedBy("1");
        auditLog.setDescription("This is a test");
        auditLog.setActionType(ActionType.INSERT);
        auditLogService.createLog(auditLog);
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
