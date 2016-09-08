package com.mapubi.sosapp.job;

import java.util.List;

import com.mapubi.sosapp.entities.Client;

public interface ClientJob {
	public Client save(Client client);
	public Client merge(Client client);
	public List<Client> listAll();
	public void remove(Client client);
}
