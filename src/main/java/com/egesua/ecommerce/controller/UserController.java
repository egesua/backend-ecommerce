package com.egesua.ecommerce.controller;

import com.egesua.ecommerce.entity.Address;
import com.egesua.ecommerce.entity.User;
import com.egesua.ecommerce.service.AddressService;
import com.egesua.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserService userService;
    private AddressService addressService;

    @Autowired
    public UserController(UserService userService, AddressService addressService) {
        this.userService = userService;
        this.addressService = addressService;
    }

    @PostMapping("/address")
    public String saveAddress(@RequestBody Address address){
        return addressService.saveAddress(address);
    }

    @GetMapping("/address")
    public List<Address> getAllAddress(){
        return addressService.getAllAddress();
    }
}
