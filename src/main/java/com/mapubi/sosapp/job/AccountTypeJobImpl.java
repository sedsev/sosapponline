package com.mapubi.sosapp.job;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mapubi.sosapp.dao.AccountTypeRepository;
import com.mapubi.sosapp.entities.AccountType;

@Service 
public class AccountTypeJobImpl implements AccountTypeJob {

	private AccountTypeRepository accountTypeRepository;
	@Override
	public AccountType save(AccountType accountType) {
		// TODO Auto-generated method stub
		return accountTypeRepository.save(accountType);
	}
	
	public AccountType merge(AccountType accountType) {
		// TODO Auto-generated method stub
		return accountTypeRepository.saveAndFlush(accountType);
	}


	@Override
	public List<AccountType> listAll() {
		// TODO Auto-generated method stub
		return accountTypeRepository.findAll();
	}

	@Override
	public void remove(AccountType accountType) {
		// TODO Auto-generated method stub
		accountTypeRepository.delete(accountType);

	}

}
