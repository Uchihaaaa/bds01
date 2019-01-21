package com.bds.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bds.entity.Client;

public interface IClient extends JpaRepository<Client, Integer>{
	
}
