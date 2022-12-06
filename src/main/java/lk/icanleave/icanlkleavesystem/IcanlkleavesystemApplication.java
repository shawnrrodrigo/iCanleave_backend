package lk.icanleave.icanlkleavesystem;

//import lk.icanleave.icanlkleavesystem.model.Employee;
//import lk.icanleave.icanlkleavesystem.model.Role;
//import lk.icanleave.icanlkleavesystem.model.customEnum.RoleStatus;
//import lk.icanleave.icanlkleavesystem.model.customEnum.UserRoleType;
//import lk.icanleave.icanlkleavesystem.repository.EmpRepository;
//import lk.icanleave.icanlkleavesystem.repository.RoleRepository;
//import lk.icanleave.icanlkleavesystem.service.EmployeeService;
//import lk.icanleave.icanlkleavesystem.service.RoleService;
//import lk.icanleave.icanlkleavesystem.service.RoleServiceImplementation;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import javax.annotation.Resource;
//import java.time.LocalDate;

@SpringBootApplication
public class IcanlkleavesystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(IcanlkleavesystemApplication.class, args);
    }
//
//    @Resource
//    private RoleService roleService;
//    @Resource
//    private EmployeeService employeeService;
//    @Override
//    public void run(String... args) throws Exception {
////        Role role = new Role();
////
////        role.setName(String.valueOf(UserRoleType.EMPLOYEE));
////        role.setStatus(RoleStatus.ACTIVE);
////        role.setEmployee();
////        roleService.saveRole(role);
//        Employee admin = new Employee();
//        admin.setId("123456789");
//        admin.setName("Admin");
//        admin.setDob(LocalDate.now());
//        admin.setDob(LocalDate.now());
//        admin.setEmail("admin@gmail.com");
//        admin.setPhone("071-1234567");
////        employeeService.register(admin);
//        Role hr = new Role();
//        hr.setName(String.valueOf(UserRoleType.HR));
//        hr.setEmployee(admin);
//        hr.setStatus(RoleStatus.ACTIVE);
//        Role employee = new Role();
//        employee.setEmployee(admin);
//        employee.setStatus(RoleStatus.ACTIVE);
//        employee.setName("Employee");
//
//        Role teamleader = new Role();
//        teamleader.setStatus(RoleStatus.ACTIVE);
//        teamleader.setEmployee(admin);
//        teamleader.setName("TeamLeader");
//
//        roleService.saveRole(hr);
//        roleService.saveRole(employee);
//        roleService.saveRole(teamleader);
//    }

}
