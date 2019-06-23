package com.example.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repo.CustomerRepository;
import com.example.repo.TransactionRepository;
import com.example.service.TransactionService;

import antlr.collections.List;

@Service
public class TransactionServiceImpl implements TransactionService {

	@Autowired(required = true)
	private TransactionRepository txnRepository;

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public List<TransactionDetail> findByAccNum(String accountNo) {
		return txnRepository.findByAccountNum(accountNo) ;
	}
	
}
