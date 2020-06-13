package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.client.Account;
import com.example.demo.client.Address;

public interface AddressRepository extends CrudRepository<Address, Long> {

}
