package com.example.data.entity;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "Labour")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Labour {

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	private String labId;

	private String labName;
	private String location;
	private String field;
	private String experience;
	private double amountPerDay;
	private int filedNum;
	private String mobileNum;

}
