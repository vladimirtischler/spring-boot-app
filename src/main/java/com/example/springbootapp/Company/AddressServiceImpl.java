package com.example.springbootapp.Company;

import com.example.springbootapp.Company.Address;
import com.example.springbootapp.Company.AddressRepository;
import com.example.springbootapp.Company.AddressService;

public class AddressServiceImpl implements AddressService {
    AddressRepository addressRepository;

    public AddressServiceImpl(AddressRepository addressRepository){
        this.addressRepository = addressRepository;
    }
    @Override
    public void saveAddress(Address address) {
        addressRepository.save(address);
    }
}
