package lk.icanleave.icanlkleavesystem.service;

import lk.icanleave.icanlkleavesystem.model.Role;
import lk.icanleave.icanlkleavesystem.repository.RoleRepository;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImplementation implements RoleService{
    private final RoleRepository roleRepository;

    public RoleServiceImplementation(RoleRepository roleRepository){
        this.roleRepository = roleRepository;
    }

    @Override
    public Role saveRole(Role role) {
        return roleRepository.save(role);
    }
}
