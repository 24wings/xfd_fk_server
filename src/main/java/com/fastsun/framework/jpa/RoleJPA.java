package com.fastsun.framework.jpa;

import com.fastsun.framework.entity.rbac.Role;
import com.fastsun.framework.jpa.base.BaseRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface RoleJPA extends BaseRepository<Role,Integer> ,JpaSpecificationExecutor<Role> {
    List<Role> findByRoleIdIn(int[] roleIds);
}
