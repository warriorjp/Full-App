package com.departmentservice.departmentservice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.departmentservice.departmentservice.entity.Department;
import com.departmentservice.departmentservice.model.DepartmentModel;
import com.departmentservice.departmentservice.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;




@RestController
@RequestMapping("/department")
@Slf4j
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/")
	public  Department saveDepartment (@RequestBody DepartmentModel departmentModel) {
		Department department=new Department();
	    department.setDepartMentAddress(departmentModel.getDepartMentAddress());
	    department.setDepartMentCode(departmentModel.getDepartMentCode());
	    department.setDepartMentName(departmentModel.getDepartMentName());
	    return departmentService.saveDepartment(department);
		
	}
	
	@GetMapping("/{Id}")
 public Optional<Department> getDepartment(@PathVariable long Id) {	
		return departmentService.getDepartment(Id);
	}
	
 }