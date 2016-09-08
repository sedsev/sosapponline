package com.mapubi.sosapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mapubi.sosapp.entities.Account;
import com.mapubi.sosapp.entities.AccountType;
import com.mapubi.sosapp.job.AccountTypeJob;

@RestController
public class AccountTypeRestController {
	@Autowired
	private AccountTypeJob accountTypeJob;

	public AccountType save(AccountType accountType) {
		return accountTypeJob.save(accountType);
	}

	public AccountType merge(AccountType accountType) {
		return accountTypeJob.merge(accountType);
	}

	public List<AccountType> listAll() {
		return accountTypeJob.listAll();
	}

	public void remove(AccountType accountType) {
		accountTypeJob.remove(accountType);
	}
	
	
}
