package com.example.service;

import com.example.bean.AccountDetail;
import com.example.model.CustomerDetails;

public interface CustomerService {

	public CustomerDetails addCustomer(CustomerDetails customerDetail);

	public AccountDetail displayDetail(int id);

}
