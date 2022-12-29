package com.example.data.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.data.entity.UserRequest;

@Repository
public interface UserRequestRepository extends JpaRepository<UserRequest, String> {

}
