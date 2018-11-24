package com.fastsun.xfd.service;

import java.util.List;

import com.fastsun.framework.entity.rbac.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface UserJpa extends CrudRepository<User, Long> {
    User findById(Integer id);

    User findFirstByUserName(String userName);
}