package com.fastsun.framework.jpa;

import com.fastsun.framework.entity.rbac.User;
import com.fastsun.framework.jpa.base.BaseRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface UserJPA extends BaseRepository<User, Integer>, JpaSpecificationExecutor<User> {

    User findByUserName(String userName);

    List<User> findByIdIn(int[] ints);
}
