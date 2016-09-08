package com.mapubi.sosapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mapubi.sosapp.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
