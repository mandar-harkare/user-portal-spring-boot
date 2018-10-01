package com.devglan.userportal;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.repository.Repository;

import java.util.List;


public interface UserRepository extends Repository {

    void delete(User user);

    @SuppressWarnings("rawtypes")
	List findAll();

    User findOne(int id);

    User save(User user);
}
