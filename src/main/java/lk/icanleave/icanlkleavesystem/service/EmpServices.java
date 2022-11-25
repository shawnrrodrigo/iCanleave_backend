package lk.icanleave.icanlkleavesystem.service;

import lk.icanleave.icanlkleavesystem.repository.EmpRepository;

public class EmpServices {
    private final EmpRepository empRepository;

    public EmpServices(EmpRepository empRepository) {
        this.empRepository = empRepository;
    }
}
