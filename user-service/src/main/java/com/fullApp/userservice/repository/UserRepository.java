package com.fullApp.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fullApp.userservice.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	@Query("from User where user_id=:id")
	public User findByUserId(@Param("id") Long id);

}
