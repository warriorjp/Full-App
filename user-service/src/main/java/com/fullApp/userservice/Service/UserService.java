package com.fullApp.userservice.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fullApp.userservice.entity.User;
import com.fullApp.userservice.model.Department;
import com.fullApp.userservice.model.ResponseTemplate;
import com.fullApp.userservice.repository.UserRepository;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	public User save(User user) {
		return userRepository.save(user);
	}

	public ResponseTemplate getUserWithDepartment(Long id) {
		ResponseTemplate responseTemplate=new ResponseTemplate();
		User user=userRepository.findByUserId(id);
			Department department=restTemplate.getForObject("http://DEPARTMENT-SERVICE/department/"+user.getDepartmentId(),Department.class);
		    responseTemplate.setDepartment(department);
		    responseTemplate.setUser(user);
	
		return responseTemplate;
	}	
	
}
