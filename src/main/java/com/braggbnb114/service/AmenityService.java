package com.braggbnb114.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.braggbnb114.domain.Amenity;
import com.braggbnb114.dto.AmenityDTO;
import com.braggbnb114.dto.AmenitySearchDTO;
import com.braggbnb114.dto.AmenityPageDTO;
import com.braggbnb114.dto.AmenityConvertCriteriaDTO;
import com.braggbnb114.service.GenericService;
import com.braggbnb114.dto.common.RequestDTO;
import com.braggbnb114.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface AmenityService extends GenericService<Amenity, Integer> {

	List<Amenity> findAll();

	ResultDTO addAmenity(AmenityDTO amenityDTO, RequestDTO requestDTO);

	ResultDTO updateAmenity(AmenityDTO amenityDTO, RequestDTO requestDTO);

    Page<Amenity> getAllAmenitys(Pageable pageable);

    Page<Amenity> getAllAmenitys(Specification<Amenity> spec, Pageable pageable);

	ResponseEntity<AmenityPageDTO> getAmenitys(AmenitySearchDTO amenitySearchDTO);
	
	List<AmenityDTO> convertAmenitysToAmenityDTOs(List<Amenity> amenitys, AmenityConvertCriteriaDTO convertCriteria);

	AmenityDTO getAmenityDTOById(Integer amenityId);







}




