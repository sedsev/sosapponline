package com.mapubi.sosapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mapubi.sosapp.entities.Account;
import com.mapubi.sosapp.job.AccountJob;

@RestController
public class AccountRestController {
	@Autowired
	private AccountJob accountJob;
	
	@RequestMapping(value="/clients/create", method=RequestMethod.POST)
	public Account save(@RequestBody Account account) {
		return accountJob.save(account);
	}
	
	@RequestMapping(value="/clients/list", method=RequestMethod.GET)
	public List<Account> listAll() {
		return accountJob.listAll();
	}
	
	@RequestMapping(value="/clients/delete", method=RequestMethod.GET)
	public void remove(@RequestBody Account account) {
		accountJob.remove(account);
	}
}
