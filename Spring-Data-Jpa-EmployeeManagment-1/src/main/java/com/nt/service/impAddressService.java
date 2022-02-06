package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Address;
import com.nt.reposetry.AddressRepo;

@Service
public class impAddressService implements AddressService{

	@Autowired
	private AddressRepo addRepo;
	
	@Override
	public void saveAddrerss(Address address) {
		// TODO Auto-generated method stub
		addRepo.save(address);
	}

}
