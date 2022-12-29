package com.example.user.serviceImpl;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

import com.example.data.Exception.UserNotFoundException;
import com.example.data.Repository.LabourRepository;
import com.example.data.Repository.UserRepository;
import com.example.data.Repository.UserRequestRepository;
import com.example.data.entity.Labour;
import com.example.data.entity.User;
import com.example.data.entity.UserRequest;
import com.example.user.dto.LabourDto;
import com.example.user.dto.LabourList;
import com.example.user.dto.LabourRestDto;
import com.example.user.service.UserService;



@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	LabourRepository labourRepository;
	
	@Autowired
	UserRequestRepository userRequestRepository;
	
	@Autowired
	RestTemplate restTemplate;

	@Override
	public User saveUserDetails(User userDetails) {
		try {
		User user=new User();
		if (!Objects.isNull(userDetails)) {

			user=User.builder()
					.userName(userDetails.getUserName())
					.address(userDetails.getAddress())
					.mobilNum(userDetails.getMobilNum())
					.build();
		}
		return userRepository.save(user);
		}
		catch(UserNotFoundException e) {
			throw e;
		}
		
	}

	@Override
	public List<Labour> getLabourDetails(String field, String amountPerDay) throws Exception {
		List<Labour> LabourDetails=null;
		try{
			if(Objects.nonNull(field) && !StringUtils.isEmpty(amountPerDay)) {
			 LabourDetails=labourRepository.findByFieldAndAmountPerDay(field,amountPerDay);
			return LabourDetails;
			}
			else if(Objects.nonNull(field)) {
				 LabourDetails=labourRepository.findByField(field);
				 return LabourDetails;
			}
		}
		catch(Exception e){
			throw new Exception("Invalid Input!!!");
		}
		 return LabourDetails;
	}

	@Override
	public UserRequest requestforWork(UserRequest userRequest) throws Exception {
		try {
		UserRequest request=null;
		if(Objects.nonNull(userRequest)) {
			request=UserRequest.builder()
					.userId(userRequest.getUserId())
					.labId(userRequest.getLabId())
					.field(userRequest.getField())
					.moilNum(userRequest.getMoilNum())
					.build();
		}
		return userRequestRepository.save(request);
		}
		catch(Exception e) {
			throw new Exception("Invalid Request!!!");
		}
	}

	@Override
	public ResponseEntity<LabourDto> labourDetils(String id) {
		LabourDto dto=new LabourDto();
		User user=new User();
		Object labour=new Object();
		try {
		if(Objects.nonNull(id)) {
			 user= userRepository.findById(id).get();
			if(Objects.nonNull(user)) {
				String uri="http://localhost:8081/api/labour/get";
				 labour=  restTemplate.getForObject(uri,Object.class);

				
				System.out.println(labour);
				
			}
		}
		dto.setUser(user);
		dto.setLabour(labour);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("catch calll....");
		}
		 return ResponseEntity.ok().body(dto);
	}

}
