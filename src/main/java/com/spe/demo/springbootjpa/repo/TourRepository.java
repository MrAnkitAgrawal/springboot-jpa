package com.spe.demo.springbootjpa.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.spe.demo.springbootjpa.domain.Tour;

public interface TourRepository extends CrudRepository<Tour, Integer> {
	List<Tour> findByTourPackageCode(String code);
	
	
	
}
