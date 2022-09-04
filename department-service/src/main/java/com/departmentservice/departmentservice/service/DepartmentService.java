package com.departmentservice.departmentservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.departmentservice.departmentservice.entity.Department;
import com.departmentservice.departmentservice.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;
	
	public Department saveDepartment(Department department) {

		return departmentRepository.save(department);
	}
	
	public Optional<Department> getDepartment(long Id) {
		return departmentRepository.findById(Id);
	}
}
