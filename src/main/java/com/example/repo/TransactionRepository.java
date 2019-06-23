package com.example.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.model.TransactionDetails;

@Repository
public interface TransactionRepository extends JpaRepository<TransactionDetails, Integer> {

	@Query(value = "FROM TransactionDetails t WHERE t.drAccount = :accountNo or t.crAccount= :accountNo")
	public List<TransactionDetails> findByAccountNum(@Param(value = "accountNo") String accountNo);

}
