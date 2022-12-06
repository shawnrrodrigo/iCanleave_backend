package lk.icanleave.icanlkleavesystem.service;
//resolving roleback issue
import lk.icanleave.icanlkleavesystem.model.Employee;
import lk.icanleave.icanlkleavesystem.repository.EmpRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImplementation implements EmployeeService{
    private final EmpRepository empRepository;

    public EmployeeServiceImplementation(EmpRepository empRepository) {
        this.empRepository = empRepository;
    }

    @Override
    public Employee register(Employee employee) {
        return empRepository.save(employee);
    }

    @Override
    public List<Employee> getEmployee() {
        return null;
    }

    @Override
    public Optional<Employee> getEmployeeById(String id) {
        System.out.println(id);
        Employee employee = empRepository.findById(id).get();
        System.out.println(employee);
        return Optional.of(employee);
    }
}
