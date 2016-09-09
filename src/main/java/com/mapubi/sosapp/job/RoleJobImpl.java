package com.mapubi.sosapp.job;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapubi.sosapp.dao.RoleRepository;
import com.mapubi.sosapp.entities.Account;
import com.mapubi.sosapp.entities.Role;

@Service
public class RoleJobImpl implements RoleJob {
	@Autowired
	private RoleRepository roleRepository;

	@Override
	public Role save(Role role) {
		// TODO Auto-generated method stub
		role.setCreated(new Date());
		role.setState(1);
		return roleRepository.save(role);
	}

	@Override
	public Role merge(Role role) {
		// TODO Auto-generated method stub
		return roleRepository.saveAndFlush(role);
	}

	@Override
	public List<Role> listAll() {
		// TODO Auto-generated method stub
		return roleRepository.findAll();
	}

	@Override
	public void remove(Role role) {
		// TODO Auto-generated method stub
		roleRepository.delete(role);
		
	}
	
	

}
