package com.fastsun.xfd.service;

import java.util.List;

import com.fastsun.xfd.entity.Member;
import com.fastsun.xfd.entity.enums.MemberStatusEnum;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface MemberJpa extends CrudRepository<Member, Long> {
    Member findByMealCardNo(String mealCardNo);

    // Member findByMealCardNoAndICSN(String mealCardNo);

    Member findById(Integer id);

    List<Member> findByMemberStatusEquals(MemberStatusEnum status);
}