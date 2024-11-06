package com.braggbnb114.dao;

import java.util.List;

import com.braggbnb114.dao.GenericDAO;
import com.braggbnb114.domain.Amenity;





public interface AmenityDAO extends GenericDAO<Amenity, Integer> {
  
	List<Amenity> findAll();
	






}


