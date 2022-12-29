package com.example.labour.serviceImpl;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.data.Exception.LabourNotFoundException;
import com.example.data.Repository.LabourRepository;
import com.example.data.entity.Labour;
import com.example.labour.service.LabourService;

@Service
public class LabourServiceImpl implements LabourService {

	@Autowired
	LabourRepository labourRepository;

	@Override
	public Labour saveLabourDetails(Labour labour) {
		Labour lab = new Labour();
		try {
			if (!Objects.isNull(labour)) {
				lab = Labour.builder().labName(labour.getLabName()).location(labour.getLocation())
						.experience(labour.getExperience()).amountPerDay(labour.getAmountPerDay())
						.filedNum(labour.getFiledNum()).field(labour.getField()).mobileNum(labour.getMobileNum())
						.build();

			}
		} catch (LabourNotFoundException e) {
			throw e;
		}
		return labourRepository.save(lab);
	}

	@Override
	public List<Labour> getAllLabour() throws Exception {
		List<Labour> allLabours = null;
		try {
			allLabours = labourRepository.findAll();
		} catch (LabourNotFoundException e) {
			// TODO: handle exception
			throw new Exception("LabourDetails Not Found!!!");
		}

		return allLabours;
	}

	@Override
	public List<Labour> getLabourDetails(String field, String amountPerDay) throws Exception {
		List<Labour> LabourDetails = null;
		try {
			if (Objects.nonNull(field) && !StringUtils.isEmpty(amountPerDay)) {
				LabourDetails = labourRepository.findByFieldAndAmountPerDay(field, amountPerDay);
				return LabourDetails;
			} else if (Objects.nonNull(field)) {
				LabourDetails = labourRepository.findByField(field);
				return LabourDetails;
			}
		} catch (Exception e) {
			throw new Exception("Invalid Input!!!");
		}
		return LabourDetails;
	}

}
