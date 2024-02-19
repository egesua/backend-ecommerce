package com.egesua.ecommerce.controller;

import com.egesua.ecommerce.converter.Converter;
import com.egesua.ecommerce.dto.response.AddressResponse;
import com.egesua.ecommerce.entity.Address;
import com.egesua.ecommerce.service.AddressService;
import com.egesua.ecommerce.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address")
public class AddressController {
    private AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping("/{id}")
    public AddressResponse getAddressById(@PathVariable long id){
        return Converter.findAddress(addressService.findAddressByID(id));
    }

    @PutMapping("/{id}")
    public AddressResponse updateAddress(@RequestBody Address address, @PathVariable long id){
        return null;
        //TODO update method
    }

}
