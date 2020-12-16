package com.example.springbootapp.Company.Service;

import com.example.springbootapp.Company.Address;
import com.example.springbootapp.Company.Repository.AddressRepository;

public class AddressServiceImpl implements AddressService{
    AddressRepository addressRepository;

    public AddressServiceImpl(AddressRepository addressRepository){
        this.addressRepository = addressRepository;
    }
    @Override
    public void saveAddress(Address address) {
        addressRepository.save(address);
    }
}
