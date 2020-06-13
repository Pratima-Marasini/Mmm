package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.client.Account;
import com.example.demo.client.Address;
import com.example.demo.client.Customer;
import com.example.demo.client.Transaction;
import com.example.demo.repository.AccountRepository;
import com.example.demo.repository.AddressRepository;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.TransactionRepository;




@Controller
public class CustomerApp {
	
	
	@Autowired
	CustomerRepository repository;
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("/addCustomer")
	public String addCustomer(Customer customer) {
		//repository.save(customer);
		
		return "home.jsp";
	}
	
	
	@Bean
	public CommandLineRunner demo(CustomerRepository repository, AccountRepository accountRepository,AddressRepository addressRepository, 
			TransactionRepository transactionRepository) {
		return (args) -> {
			
			
			
			Address address = new Address("US","City","Street",5);
			addressRepository.save(address);
			
			Transaction transaction = new Transaction(12457894,25,"02.03.2020");
			transactionRepository.save(transaction);
			
			Account account = new Account(12457894,"George",14,new ArrayList<Transaction>(Arrays.asList(transaction)));
			accountRepository.save(account);
			
			Customer customer = new Customer("George","Floyd",address, new ArrayList<Account>(Arrays.asList(account)));
			repository.save(customer);
			
			
			
		};
	}
}
