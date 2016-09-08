package com.mapubi.sosapp.job;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapubi.sosapp.dao.AccountRepository;
import com.mapubi.sosapp.entities.Account;

@Service
public class AccountJobImpl implements AccountJob{
	
	@Autowired
	private AccountRepository accountRepository;

	@Override
	public Account save(Account account) {
		// TODO Auto-generated method stub
		return accountRepository.save(account);
	}
	
	@Override
	public Account merge(Account account) {
		// TODO Auto-generated method stub
		return accountRepository.save(account);
	}

	@Override
	public List<Account> listAll() {
		// TODO Auto-generated method stub
		return accountRepository.findAll();
	}

	@Override
	public void remove(Account account) {
		// TODO Auto-generated method stub
		accountRepository.delete(account);;
	}
	
}
