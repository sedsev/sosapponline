package com.mapubi.sosapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mapubi.sosapp.entities.SOSUser;

public interface SOSUserRepository extends JpaRepository<SOSUser, Long>{

}
