package com.mapubi.sosapp.job;

import java.util.List;

import com.mapubi.sosapp.entities.DescriptionElement;

public interface DescriptionElementJob {
	public DescriptionElement save(DescriptionElement descriptionElement);
	public DescriptionElement merge(DescriptionElement descriptionElement);
	public List<DescriptionElement> listAll();
	public void remove(DescriptionElement descriptionElement);
}
