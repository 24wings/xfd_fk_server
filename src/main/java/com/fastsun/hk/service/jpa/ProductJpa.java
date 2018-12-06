package com.fastsun.hk.service.jpa;

import com.fastsun.framework.jpa.base.BaseRepository;
import com.fastsun.hk.entity.Product;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Service;

@Service
public interface ProductJpa extends BaseRepository<Product, Integer>, JpaSpecificationExecutor<Product> {
    // List<AccountRepay> findByDeptIdIn(List<Integer> debtIds);
    // List<AccountRepay> findByDeptIdAndRepayStatus(Integer deptId, RepayStatus
    // repayStatus);
}
