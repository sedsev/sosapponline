package com.mapubi.sosapp.job;

import java.util.List;

import com.mapubi.sosapp.entities.Account;

public interface AccountJob {
	public Account save(Account account);
	public List<Account> listAll();
	public void remove(Account account);
}
