package com.mapubi.sosapp.job;

import java.util.List;

import com.mapubi.sosapp.entities.ServiceDescriptionType;

public interface ServiceDescriptionTypeJob {
	public ServiceDescriptionType save(ServiceDescriptionType type);
	public ServiceDescriptionType merge(ServiceDescriptionType type);
	public List<ServiceDescriptionType> listAll();
	public void remove(ServiceDescriptionType type);
}
