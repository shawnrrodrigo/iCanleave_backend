package lk.icanleave.icanlkleavesystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//public class IcanlkleavesystemApplication implements CommandLineRunner {
public class IcanlkleavesystemApplication{
    public static void main(String[] args) {
        SpringApplication.run(IcanlkleavesystemApplication.class, args);
    }

//    @Resource
//    private EmpRepository empRepository;

//    @Override
//    public void run(String... args) throws Exception {
//        Employee emp = new Employee();
//        emp.setEmpId("e0001");
//        emp.setEmpName("Shawn");
//        emp.setEmail("shawn@gmail.com");
//        emp.setPhone("0775232345");
//        empRepository.save(emp);
//
//        Employee emp1 = new Employee();
//        emp1.setEmpId("e0002");
//        emp1.setEmpName("Naween");
//        emp1.setEmail("naween@gmail.com");
//        emp1.setPhone("0775232345");
//        empRepository.save(emp1);
//
//        Employee emp2 = new Employee();
//        emp2.setEmpId("e0003");
//        emp2.setEmpName("Kavira");
//        emp2.setEmail("kavira@gmail.com");
//        emp2.setPhone("0775232345");
//        emp2.setDob(LocalDate.of(1998, 9, 12));
//        empRepository.save(emp2);
//    }
}
