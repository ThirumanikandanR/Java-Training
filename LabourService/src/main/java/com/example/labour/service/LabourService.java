package com.example.labour.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.data.entity.Labour;

@Service
public interface LabourService {

	Labour saveLabourDetails(Labour labour);

	List<Labour> getAllLabour() throws Exception;

	List<Labour> getLabourDetails(String field, String amountPerDay) throws Exception;

	

}
