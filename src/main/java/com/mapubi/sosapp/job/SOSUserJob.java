package com.mapubi.sosapp.job;

import java.util.List;

import com.mapubi.sosapp.entities.SOSUser;

public interface SOSUserJob {
	public SOSUser save(SOSUser user);
	public SOSUser merge(SOSUser user);
	public List<SOSUser> listAll();
	public void remove(SOSUser user);
}
