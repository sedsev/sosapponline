package com.mapubi.sosapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mapubi.sosapp.entities.Operation;

public interface OperationRepository extends JpaRepository<Operation, Long>{

}
