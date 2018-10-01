package com.devglan.userportal;

import java.util.List;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

public interface UserService {

	User create(User user);

	User findById(int id);

	User update(User user);

	User delete(int id);

	List<?> findAll();

}
