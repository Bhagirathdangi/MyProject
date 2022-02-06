package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Address;
import com.nt.repositry.AddressRepo;
@Service
public class AddressService implements AddressServiceInt {

	@Autowired
	private AddressRepo addRepo;
	
	@Override
	public void saveAddress(Address address) {
		
		addRepo.save(address);
		
	}

}
