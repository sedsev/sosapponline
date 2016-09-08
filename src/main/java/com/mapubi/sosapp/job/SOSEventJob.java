package com.mapubi.sosapp.job;

import java.util.List;

import com.mapubi.sosapp.entities.Account;
import com.mapubi.sosapp.entities.SOSEvent;
import com.mapubi.sosapp.entities.SOSUser;

public interface SOSEventJob {
	public SOSEvent save(SOSEvent alert);
	public List<SOSEvent> listAll();
	public boolean notifyAccount(Account account);
	public boolean notifyAllAccount();
	public boolean notifyUser(SOSUser user);
}
