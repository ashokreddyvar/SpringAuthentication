package com.ojas.dao;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepositery extends JpaRepository<User, Long> {
	User findbyUsername(String userName);

}
