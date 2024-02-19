package com.egesua.ecommerce.service;

import com.egesua.ecommerce.entity.Address;
import com.egesua.ecommerce.exception.CommerceException;
import com.egesua.ecommerce.repository.AddressRepository;
import com.egesua.ecommerce.utilandvalidations.GeneralValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

@Service
public class AddressServiceImpl implements AddressService{

    private AddressRepository addressRepository;

    @Autowired
    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public Address findAddressByID(long id) {
        Optional<Address> addressOptional=addressRepository.findById(id);
        if(addressOptional.isPresent()){
            return addressOptional.get();
        }
        throw new CommerceException(GeneralValidation.IS_NOT_PRESENT_ADDRESS, HttpStatus.NOT_FOUND);
    }

    @Override
    public List<Address> getAllAddress() {
        return addressRepository.findAll();
    }

    @Override
    public String saveAddress(Address address) {
        GeneralValidation.checkEmptyOrNull(address.getName(),"name");
        GeneralValidation.checkEmptyOrNull(address.getCity(),"city");
        GeneralValidation.checkEmptyOrNull(address.getDistrict(),"district");
        GeneralValidation.checkEmptyOrNull(address.getTitle(),"title");
        GeneralValidation.checkEmptyOrNull(address.getNeighborhood(),"neighborhood");
        GeneralValidation.checkEmptyOrNull(address.getSurname(),"surname");
        GeneralValidation.checkEmptyOrNull(address.getPhone(),"phone");
        addressRepository.save(address);
        return "address has been added successfully";
    }
}
