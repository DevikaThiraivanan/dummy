package com.cg.spring.repo;

import  com.cg.spring.bean.*;

public interface WalletRepo {

	public boolean save(Customer customer);	
	public Customer findOne(String mobileNo);
}
