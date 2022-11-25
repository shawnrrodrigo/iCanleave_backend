package lk.icanleave.icanlkleavesystem;

import lk.icanleave.icanlkleavesystem.model.Employee;
import lk.icanleave.icanlkleavesystem.repository.EmpRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class IcanlkleavesystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(IcanlkleavesystemApplication.class, args);
    }

    @Resource
    private EmpRepository empRepository;

    @Override
    public void run(String... args) throws Exception {
        Employee emp = new Employee();
        emp.setEmpId("e0001");
        emp.setEmpName("Shawn");
        emp.setEmail("shawn@gmail.com");
        emp.setPhone("0775232345");
        empRepository.save(emp);

        Employee emp1 = new Employee();
        emp1.setEmpId("e0002");
        emp1.setEmpName("Naween");
        emp1.setEmail("naween@gmail.com");
        emp1.setPhone("0775232345");
        empRepository.save(emp1);
    }
}
