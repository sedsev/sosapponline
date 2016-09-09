package com.mapubi.sosapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mapubi.sosapp.entities.Account;
import com.mapubi.sosapp.entities.Client;
import com.mapubi.sosapp.entities.SOSEvent;
import com.mapubi.sosapp.entities.SOSUser;
import com.mapubi.sosapp.job.ClientJob;
import com.mapubi.sosapp.job.SOSEventJob;

@RestController
public class SOSEventRestController {
	@Autowired
	private SOSEventJob sosEventJob;
	
	public SOSEvent save(SOSEvent alert) {
		return sosEventJob.save(alert);
	}

	public SOSEvent merge(SOSEvent alert) {
		return sosEventJob.merge(alert);
	}

	public List<SOSEvent> listAll() {
		return sosEventJob.listAll();
	}

	public boolean notifyAccount(Account account) {
		return sosEventJob.notifyAccount(account);
	}

	@RequestMapping(value="/sosevents/all", method=RequestMethod.GET)
	public boolean notifyAllAccount() {
		return sosEventJob.notifyAllAccount();
	}

	public boolean notifyUser(SOSUser user) {
		return sosEventJob.notifyUser(user);
	}
}
