package com.mapubi.sosapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mapubi.sosapp.entities.SOSUser;
import com.mapubi.sosapp.job.SOSUserJob;

@RestController
public class SOSUserRest {
	@Autowired
	private SOSUserJob roleJob;
	
	@RequestMapping(value="/sosuser/create", method=RequestMethod.POST)
	public SOSUser save(@RequestBody SOSUser user) {
		return roleJob.save(user);
	}

	public SOSUser merge(SOSUser user) {
		return roleJob.merge(user);
	}

	public List<SOSUser> listAll() {
		return roleJob.listAll();
	}

	public void remove(SOSUser user) {
		roleJob.remove(user);
	}
}
