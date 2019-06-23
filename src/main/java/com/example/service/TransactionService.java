package com.example.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.model.TransactionDetails;

public interface TransactionService {

	public List<TransactionDetails> findByAccNum(String accountNo);

}
