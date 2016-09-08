package com.mapubi.sosapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mapubi.sosapp.entities.Role;
import com.mapubi.sosapp.job.RoleJob;

@RestController
public class RoleRestController {
	@Autowired
	private RoleJob roleJob;
	
	@RequestMapping(value="/role/create", method=RequestMethod.POST)
	public Role save(@RequestBody Role role) {
		return roleJob.save(role);
	}

	@RequestMapping(value="/role/update", method=RequestMethod.PUT)
	public Role merge(@RequestBody Role role) {
		return roleJob.merge(role);
	}
	
	@RequestMapping(value="/role/list", method=RequestMethod.GET)
	public List<Role> listAll() {
		return roleJob.listAll();
	}

	@RequestMapping(value="/role/delete", method=RequestMethod.POST)
	public void remove(Role role) {
		roleJob.remove(role);
	}
}
