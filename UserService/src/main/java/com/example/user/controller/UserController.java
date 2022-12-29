package com.example.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.data.entity.Labour;
import com.example.data.entity.User;
import com.example.data.entity.UserRequest;
import com.example.user.dto.LabourDto;
import com.example.user.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	UserService userService;
	

	@PostMapping("/save")
	public User saveLabour(@RequestBody User user) {
		return userService.saveUserDetails(user);
	}
	
	@GetMapping("/get/labour")
	public List<Labour> getLabourDetails(@RequestParam("Field") String field,@RequestParam("AmountPerDay") String amountPerDay ) throws Exception{
		return userService.getLabourDetails(field,amountPerDay);
		
	}
	
	@PostMapping("/request")
	public UserRequest requestforWork(@RequestBody UserRequest userRequest) throws Exception {
		return userService.requestforWork(userRequest);
	}
	
	@GetMapping("/getAll/LabourDetails/{id}")
	public ResponseEntity<LabourDto> labourDetils(@PathVariable String id){
		return userService.labourDetils(id);
		
	}
	
	
	
	

}
