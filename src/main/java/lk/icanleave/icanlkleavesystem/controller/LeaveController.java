package lk.icanleave.icanlkleavesystem.controller;

import lk.icanleave.icanlkleavesystem.model.Employee;
import lk.icanleave.icanlkleavesystem.model.Leave;
import lk.icanleave.icanlkleavesystem.repository.LeaveRepository;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/leave")
public class LeaveController {

    @Resource
    private LeaveRepository leaveRepository;

    @GetMapping
    public List<Leave> getAllLeaveRecords(){
        return leaveRepository.findAll();
    }

    @PostMapping()
    public Leave requestLeave(@RequestHeader(value = "UserId") HttpHeaders empId, @RequestBody Leave leaveRecord){
        System.out.println("employee Id"+empId);
        return leaveRepository.save(leaveRecord);
    }
//    private ResponseEntity<String> requestLeave(@RequestHeader(value = "UserId") HttpHeaders id, Employee emp){
//        return leaveRepository.save(emp);
//    }


}
