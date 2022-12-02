package lk.icanleave.icanlkleavesystem.controller;

import lk.icanleave.icanlkleavesystem.model.Employee;
import lk.icanleave.icanlkleavesystem.model.LeaveRecord;
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
    public List<LeaveRecord> getAllLeaveRecords(){
        return leaveRepository.findAll();
    }

    @PostMapping()
    public LeaveRecord requestLeave(@RequestHeader(value = "UserId") HttpHeaders empId, @RequestBody LeaveRecord leaveRecord){

        System.out.println("employee Id"+empId);
        String userIdstr = empId.get("userid").toString();
        userIdstr = userIdstr.substring(1, userIdstr.length() -1);
        leaveRecord.setUserId(userIdstr);
        System.out.println(leaveRecord.toString());
        return leaveRepository.save(leaveRecord);
    }
//    private ResponseEntity<String> requestLeave(@RequestHeader(value = "UserId") HttpHeaders id, Employee emp){
//        return leaveRepository.save(emp);
//    }


}
