package com.talha.dwallet.repository;

import org.springframework.data.repository.CrudRepository;
import com.talha.dwallet.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

    
} 