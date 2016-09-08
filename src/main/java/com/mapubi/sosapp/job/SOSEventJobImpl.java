package com.mapubi.sosapp.job;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapubi.sosapp.dao.SOSEventRepository;
import com.mapubi.sosapp.entities.Account;
import com.mapubi.sosapp.entities.SOSEvent;
import com.mapubi.sosapp.entities.SOSUser;

@Service
public class SOSEventJobImpl implements SOSEventJob {
	@Autowired
	private SOSEventRepository sosEventRepository;

	@Override
	public SOSEvent save(SOSEvent alert) {
		// TODO Auto-generated method stub
		return sosEventRepository.save(alert);
	}
	
	@Override
	public SOSEvent merge(SOSEvent alert) {
		// TODO Auto-generated method stub
		return sosEventRepository.saveAndFlush(alert);
	}

	@Override
	public List<SOSEvent> listAll() {
		// TODO Auto-generated method stub
		return sosEventRepository.findAll();
	}

	@Override
	public boolean notifyAccount(Account account) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean notifyAllAccount() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean notifyUser(SOSUser user) {
		// TODO Auto-generated method stub
		return false;
	}

}
