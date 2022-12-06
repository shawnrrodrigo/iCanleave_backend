package lk.icanleave.icanlkleavesystem.service;

import lk.icanleave.icanlkleavesystem.model.Role;
import org.springframework.stereotype.Component;

@Component
public interface RoleService {
    Role saveRole(Role role);
}
