package com.mapubi.sosapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mapubi.sosapp.entities.DynamicLocation;

public interface DynamicLocationRepository extends JpaRepository<DynamicLocation, Long>{

}
