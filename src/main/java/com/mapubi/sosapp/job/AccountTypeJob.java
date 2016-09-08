package com.mapubi.sosapp.job;

import java.util.List;

import com.mapubi.sosapp.entities.AccountType;

public interface AccountTypeJob {
	public AccountType save(AccountType accountType);
	public AccountType merge(AccountType accountType);
	public List<AccountType> listAll();
	public void remove(AccountType accountType);
}
