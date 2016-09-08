package com.mapubi.sosapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mapubi.sosapp.entities.SOSEvent;

public interface SOSEventRepository extends JpaRepository<SOSEvent, Long>{

}
