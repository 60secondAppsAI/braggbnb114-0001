package com.braggbnb114.dao;

import java.util.List;

import com.braggbnb114.dao.GenericDAO;
import com.braggbnb114.domain.Payment;





public interface PaymentDAO extends GenericDAO<Payment, Integer> {
  
	List<Payment> findAll();
	






}


