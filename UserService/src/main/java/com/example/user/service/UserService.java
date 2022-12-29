package com.example.user.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.data.entity.Labour;
import com.example.data.entity.User;
import com.example.data.entity.UserRequest;
import com.example.user.dto.LabourDto;

@Service
public interface UserService {

	User saveUserDetails(User user);

	List<Labour> getLabourDetails(String filed, String amountPerDay) throws Exception;

	UserRequest requestforWork(UserRequest userRequest) throws Exception;

	ResponseEntity<LabourDto> labourDetils(String id);

}
