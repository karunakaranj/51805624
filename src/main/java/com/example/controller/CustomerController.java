package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.AccountDetail;
import com.example.model.CustomerDetails;
import com.example.service.CustomerService;

@RestController
	@RequestMapping("/bank")
	public class CustomerController {
		
		@Autowired
		private CustomerService customerService;
		
		@PostMapping("/customer")
		public CustomerDetails addCustomer(@RequestBody CustomerDetails customerDetail) {
			CustomerDetails customer =  null;
			if(customerDetail!= null) {
				customer = customerService.addCustomer(customerDetail);
			}
			return customer;
		}
		
		@GetMapping("/customer/{custId}")
		public AccountDetail getAccountDetail(@PathVariable("custId") int id) {
			return customerService.displayDetail(id);
		}

	}

	

