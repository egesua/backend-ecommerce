package com.egesua.ecommerce.service;

import com.egesua.ecommerce.dto.response.RoleResponse;
import com.egesua.ecommerce.entity.Role;
import com.egesua.ecommerce.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService{
    private RoleRepository roleRepository;

    @Autowired

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<Role> getRoles() {
        Optional<Role> roleCustomer=roleRepository.findByAuthority("customer");
        Optional<Role> roleStore=roleRepository.findByAuthority("store");
        List<Role> roles=new ArrayList<>();
        if(roleStore.isPresent() || roleCustomer.isPresent()){
            roles.add(roleStore.get());
            roles.add(roleCustomer.get());
        }
        return roles;
    }
}
