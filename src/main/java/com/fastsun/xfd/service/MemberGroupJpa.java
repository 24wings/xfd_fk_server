package com.fastsun.xfd.service;

import java.util.List;

import com.fastsun.xfd.entity.Member;
import com.fastsun.xfd.entity.enums.MemberStatusEnum;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import com.fastsun.xfd.entity.MemberGroup;

@Service
public interface MemberGroupJpa extends CrudRepository<MemberGroup, Long> {

    MemberGroup findById(Integer id);

}