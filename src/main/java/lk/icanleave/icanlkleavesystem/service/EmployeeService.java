package lk.icanleave.icanlkleavesystem.service;

import lk.icanleave.icanlkleavesystem.model.Employee;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface EmployeeService {
    public Employee register(Employee employee);

    List<Employee> getEmployee();
    Optional<Employee> getEmployeeById(String id);
}
