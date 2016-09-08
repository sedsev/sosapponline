package com.mapubi.sosapp.job;

import java.util.List;

import com.mapubi.sosapp.entities.Administrator;

public interface AdministratorJob {
	public Administrator save(Administrator administrator);
	public List<Administrator> listAll();
	public void remove(Administrator administrator);
}
