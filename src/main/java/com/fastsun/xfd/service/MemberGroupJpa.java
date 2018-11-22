package com.fastsun.xfd.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import com.fastsun.xfd.entity.MemberGroup;

@Service
public interface MemberGroupJpa extends CrudRepository<MemberGroup, Long> {

    MemberGroup findById(Integer id);

}