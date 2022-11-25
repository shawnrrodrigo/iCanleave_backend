package lk.icanleave.icanlkleavesystem.controller;

import lk.icanleave.icanlkleavesystem.model.Employee;
import lk.icanleave.icanlkleavesystem.repository.EmpRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/icanleave")
public class EmployeeController {
    @Resource
    private EmpRepository empRepository;

    @GetMapping("/employee")
    private List<Employee> getAllEmployees(){
        return empRepository.findAll();
    }
}
