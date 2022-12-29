package com.example.data.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.data.entity.Labour;

@Repository
public interface LabourRepository extends JpaRepository<Labour, String>{

	

	List<Labour> findByFieldAndAmountPerDay(String field, String amountPerDay);

	List<Labour> findByField(String field);

}
