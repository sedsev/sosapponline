package com.mapubi.sosapp.job;

import java.util.List;

import com.mapubi.sosapp.entities.LocationType;
import com.mapubi.sosapp.entities.Role;

public interface RoleJob {
	public Role save(Role role);
	public Role merge(Role role);
	public List<Role> listAll();
	public void remove(Role role);
}
