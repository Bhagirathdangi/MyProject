package com.nt.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Address;

public interface AddressRepo extends JpaRepository<Address, Integer> {

}
