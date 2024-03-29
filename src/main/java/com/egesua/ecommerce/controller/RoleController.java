package com.egesua.ecommerce.controller;

import com.egesua.ecommerce.converter.Converter;
import com.egesua.ecommerce.dto.response.RoleResponse;
import com.egesua.ecommerce.entity.Role;
import com.egesua.ecommerce.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/roles")
public class RoleController {
    private RoleService roleService;

    @Autowired
    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping
    public List<RoleResponse> findAll() {
        return Converter.findRoles(roleService.getRoles());
    }

}
