package com.braggbnb114.dao;

import java.util.List;

import com.braggbnb114.dao.GenericDAO;
import com.braggbnb114.domain.Listing;





public interface ListingDAO extends GenericDAO<Listing, Integer> {
  
	List<Listing> findAll();
	






}


