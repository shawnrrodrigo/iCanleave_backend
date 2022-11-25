package lk.icanleave.icanlkleavesystem.repository;

import lk.icanleave.icanlkleavesystem.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepository extends JpaRepository<Employee, String> {

}
