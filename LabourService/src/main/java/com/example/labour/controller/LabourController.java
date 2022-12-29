package com.example.labour.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.data.entity.Labour;
import com.example.labour.service.LabourService;

@RestController
@RequestMapping("/api/labour")
public class LabourController {
	
	@Autowired
	LabourService labourService;
	
	@PostMapping("/save")
	public Labour saveLabour(@RequestBody Labour labour) {
		return labourService.saveLabourDetails(labour);
	}
	
	@GetMapping("/get")
	public List<Labour> getAllLabour() throws Exception{
		return labourService.getAllLabour();
		
	}
	
	@GetMapping("/get/labour")
	public List<Labour> getLabourDetails(@RequestParam("Field") String field,@RequestParam("AmountPerDay") String amountPerDay ) throws Exception{
		return labourService.getLabourDetails(field,amountPerDay);
		
	}

}
