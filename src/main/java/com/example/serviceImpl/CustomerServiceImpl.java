package com.example.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.AccountDetail;
import com.example.model.CustomerDetails;
import com.example.repo.CustomerRepository;
import com.example.service.CustomerService;

@Service
	public class CustomerServiceImpl implements CustomerService {

		@Autowired(required = true)
		private CustomerRepository customerRepository;
		
		@Override
		public CustomerDetails addCustomer(CustomerDetails customerDetail) {
			CustomerDetails customer = null;
			if(customerDetail!=null) {
				customer = customerRepository.save(customerDetail);
			}
			System.out.println(customer);
			return customer;
		}

		@Override
		public AccountDetail displayDetail(int id) {
			 CustomerDetails customerDetail = customerRepository.getOne(id);
			 AccountDetail accountDetail  = new AccountDetail();
			 if(customerDetail!= null) {
				 accountDetail.setCustName(customerDetail.getUserName());
				 accountDetail.setAccountNo(customerDetail.getAccountNo());
				 accountDetail.setAccountType(customerDetail.getAccountType());
				 accountDetail.setBalance(customerDetail.getBalance());
			 }
			 return accountDetail;
		}

	}



