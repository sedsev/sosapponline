package com.mapubi.sosapp.job;

import java.util.List;

import com.mapubi.sosapp.entities.DynamicLocation;

public interface DynamicLocationJob {
	public DynamicLocation save(DynamicLocation location);
	public DynamicLocation merge(DynamicLocation location);
	public List<DynamicLocation> listAll();
	public void remove(DynamicLocation location);
}
