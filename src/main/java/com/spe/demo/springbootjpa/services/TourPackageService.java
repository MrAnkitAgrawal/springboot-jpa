package com.spe.demo.springbootjpa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spe.demo.springbootjpa.domain.TourPackage;
import com.spe.demo.springbootjpa.repo.TourPackageRepository;

@Service
public class TourPackageService {
	private TourPackageRepository tourPackageRepository;

	@Autowired
	public TourPackageService(TourPackageRepository tourPackageRepository) {
		this.tourPackageRepository = tourPackageRepository;
	}
	
	public TourPackage createTourPackage(String code, String name) {
        /*if (tourPackageRepository.findById(code) == null) {
            return tourPackageRepository.save(new TourPackage(code, name));
        } else {
            return null;
        }*/
		return tourPackageRepository.save(new TourPackage(code, name));
    }
    public Iterable<TourPackage> lookup(){
        return tourPackageRepository.findAll();
    }
    public long total() {
        return tourPackageRepository.count();
    }
}
