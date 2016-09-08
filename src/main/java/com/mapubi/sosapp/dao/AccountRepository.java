package com.mapubi.sosapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mapubi.sosapp.entities.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

}
