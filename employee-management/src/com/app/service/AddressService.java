package com.app.service;

import com.app.entity.Address;

public class AddressService {

	public static Address createAddress(int id, String street, String city, String zip, String state, String country,
			int emmp_id){
          Address addr=new Address();
          addr.setId(id);
          addr.setStreet(street);
          addr.setCity(city);
          addr.setZip(zip);
          addr.setState(state);
          addr.setCountry(country);
          addr.setId(emmp_id);

		return addr;
	}

}
