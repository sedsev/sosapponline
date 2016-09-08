package com.mapubi.sosapp.job;

import java.util.List;

import com.mapubi.sosapp.entities.Account;
import com.mapubi.sosapp.entities.SOSEvent;
import com.mapubi.sosapp.entities.SOSUser;

public class SOSEventJobImpl implements SOSEventJob {

	@Override
	public SOSEvent save(SOSEvent alert) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SOSEvent> listAll() {
		// TODO Auto-generated method stub
		return null;
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
