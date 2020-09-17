package com.divya.SpringBootMVC.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.divya.SpringBootMVC.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer>{

}
