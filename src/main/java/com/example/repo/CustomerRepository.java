package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.model.CustomerDetails;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerDetails, Integer> {

	@Query(value = "FROM CustomerDetails u WHERE u.accountNo = :accountNo")
	public CustomerDetails findByAccountNum(@Param(value = "accountNo") String accountNo);

}
