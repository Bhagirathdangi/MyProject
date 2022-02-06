package com.nt.reposetry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.entity.Address;
@Repository
public interface AddressRepo extends JpaRepository<Address, Integer>{

}
