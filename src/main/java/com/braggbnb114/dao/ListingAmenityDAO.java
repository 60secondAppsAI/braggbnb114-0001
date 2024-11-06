package com.braggbnb114.dao;

import java.util.List;

import com.braggbnb114.dao.GenericDAO;
import com.braggbnb114.domain.ListingAmenity;





public interface ListingAmenityDAO extends GenericDAO<ListingAmenity, Integer> {
  
	List<ListingAmenity> findAll();
	






}


