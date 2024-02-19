package com.egesua.ecommerce.service;

import com.egesua.ecommerce.dto.response.RoleResponse;
import com.egesua.ecommerce.entity.Role;

import java.util.List;

public interface RoleService {
    List<Role> getRoles();
}
