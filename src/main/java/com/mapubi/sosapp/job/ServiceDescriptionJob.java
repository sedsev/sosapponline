package com.mapubi.sosapp.job;

import java.util.List;

import com.mapubi.sosapp.entities.ServiceDescription;

public interface ServiceDescriptionJob {
	public ServiceDescription save(ServiceDescription serviceDescription);
	public List<ServiceDescription> listAll();
	public void remove(ServiceDescription serviceDescription);
}
