package com.braggbnb114.dao;

import java.util.List;

import com.braggbnb114.dao.GenericDAO;
import com.braggbnb114.domain.Review;





public interface ReviewDAO extends GenericDAO<Review, Integer> {
  
	List<Review> findAll();
	






}


