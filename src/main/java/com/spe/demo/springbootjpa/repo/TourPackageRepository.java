package com.spe.demo.springbootjpa.repo;

import org.springframework.data.repository.CrudRepository;

import com.spe.demo.springbootjpa.domain.TourPackage;

public interface TourPackageRepository extends CrudRepository<TourPackage, String> {
	TourPackage findByName(String name);
}
