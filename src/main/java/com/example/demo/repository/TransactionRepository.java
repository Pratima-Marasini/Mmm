package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.client.Account;
import com.example.demo.client.Transaction;

public interface TransactionRepository extends CrudRepository<Transaction, Long> {

}
