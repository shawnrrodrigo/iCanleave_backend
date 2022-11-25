package lk.icanleave.icanlkleavesystem.controller;

import lk.icanleave.icanlkleavesystem.exception.ResourceNotFoundException;
import lk.icanleave.icanlkleavesystem.model.Employee;
import lk.icanleave.icanlkleavesystem.repository.EmpRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/icanleave/employee")
public class EmployeeController {
    @Resource
    private EmpRepository empRepository;

    @GetMapping()
    private List<Employee> getAllEmployees(){
        return empRepository.findAll();
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return empRepository.save(employee);
    }

    @GetMapping("{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable String id){
       Employee emp = empRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee not exist with id:"+id));
        System.out.println("emp id"+empRepository.findById(id));
        return ResponseEntity.ok(emp);
    }

    @PutMapping("{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable String id, @RequestBody Employee employee){
        Employee updateEmployee = empRepository
                .findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id"+id));
        updateEmployee.setEmpName(employee.getEmpName());
        updateEmployee.setEmail(employee.getEmail());
        updateEmployee.setPhone(employee.getPhone());

        empRepository.save(updateEmployee);
        return ResponseEntity.ok(updateEmployee);
    }


}
