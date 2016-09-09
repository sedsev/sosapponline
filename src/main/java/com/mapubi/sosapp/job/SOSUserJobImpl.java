package com.mapubi.sosapp.job;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapubi.sosapp.dao.SOSUserRepository;
import com.mapubi.sosapp.entities.SOSUser;

@Service
public class SOSUserJobImpl implements SOSUserJob {
	@Autowired
	private SOSUserRepository sosUserRepository;
	@Override
	public SOSUser save(SOSUser user) {
		// TODO Auto-generated method stub
		return sosUserRepository.save(user);
	}

	@Override
	public SOSUser merge(SOSUser user) {
		// TODO Auto-generated method stub
		user.setDateOfBirth(new Date());
		return sosUserRepository.save(user);
	}

	@Override
	public List<SOSUser> listAll() {
		// TODO Auto-generated method stub
		return sosUserRepository.findAll();
	}

	@Override
	public void remove(SOSUser user) {
		// TODO Auto-generated method stub
		sosUserRepository.delete(user);

	}

}
