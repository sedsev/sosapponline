package com.mapubi.sosapp.job;

import java.util.List;

import com.mapubi.sosapp.entities.LocationType;

public interface LocationTypeJob {
	public LocationType save(LocationType type);
	public List<LocationType> listAll();
	public void remove(LocationType type);
}
