package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Alien;

public interface AlienRepo extends CrudRepository<Alien,Integer> 
{
	
	

}
