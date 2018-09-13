package com.spe.demo.springbootjpa.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.spe.demo.springbootjpa.domain.TourPackage;

@RepositoryRestResource(collectionResourceRel="pkgs", path="pkgs")
public interface TourPackageRepository extends CrudRepository<TourPackage, String> {
	TourPackage findByName(@Param("name") String name);

	@Override
	@RestResource(exported=false)
	void delete(TourPackage entity);
}
