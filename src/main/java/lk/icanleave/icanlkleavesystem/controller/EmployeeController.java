package lk.icanleave.icanlkleavesystem.controller;

import lk.icanleave.icanlkleavesystem.exception.ResourceNotFoundException;
import lk.icanleave.icanlkleavesystem.model.Employee;
import lk.icanleave.icanlkleavesystem.repository.EmpRepository;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@CrossOrigin("*")
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Resource
    private EmpRepository empRepository;

    @GetMapping()
    private List<Employee> getAllEmployees(){

        return empRepository.findAll();
    }

    @GetMapping("/all-headers")
    public void getAllheaders(@RequestHeader Map<String,String> headers){
        headers.forEach((key,value) ->{
            System.out.println("Header Name: "+key+" Header Value: "+value);
        });
    }

    @PostMapping
    public ResponseEntity<String> createEmployee(@RequestHeader(value="UserId") HttpHeaders userId){
        System.out.println("Emp id" +userId);
        return new ResponseEntity<String>("user Id", userId, HttpStatus.OK);
    }
//    public ResponseEntity<Map<String, String>> createEmployee(@RequestHeader(value="Accept") String acceptHeader,
//                                                              @RequestHeader(value="Authorization") String authorizationHeader){
//     Map<String, String> returnValue = new HashMap<>();
//     returnValue.put("Accept", acceptHeader);
//     returnValue.put("Authorization", authorizationHeader);
//     return ResponseEntity.status(HttpStatus.OK).body(returnValue);
//    }

    @GetMapping("{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable String id){
       Employee emp = empRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee not exist with id:"+id));
     //   System.out.println("emp id"+empRepository.findById(id));
        return ResponseEntity.ok(emp);
    }

    //    public Employee createEmployee(@RequestBody Employee employee) {
//        return empRepository.save(employee);
//        //random id
//        //spring security framework
//    }
    @PutMapping("{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable String id, @RequestBody Employee employee){
        Employee updateEmployee = empRepository
                .findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id"+id));
        //string bean utils copy non null value
        updateEmployee.setEmpName(employee.getEmpName());
        updateEmployee.setEmail(employee.getEmail());
        updateEmployee.setPhone(employee.getPhone());

      //  return empRepository.save(updateEmployee);
       return ResponseEntity.ok(empRepository.save(updateEmployee));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Employee> deleteEmployee(@PathVariable String id){
        Employee employee = empRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Employee not exist with id:"+id));
        empRepository.delete(employee);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
