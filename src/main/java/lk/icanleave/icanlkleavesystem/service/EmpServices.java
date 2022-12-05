package lk.icanleave.icanlkleavesystem.service;
//resolving roleback issue
import lk.icanleave.icanlkleavesystem.repository.EmpRepository;
import org.springframework.stereotype.Service;

@Service
public class EmpServices {
    private final EmpRepository empRepository;

    public EmpServices(EmpRepository empRepository) {
        this.empRepository = empRepository;
    }
}
