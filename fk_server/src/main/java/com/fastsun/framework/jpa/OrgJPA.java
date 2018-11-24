package com.fastsun.framework.jpa;

import com.fastsun.framework.entity.rbac.Org;
import com.fastsun.framework.jpa.base.BaseRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface OrgJPA extends BaseRepository<Org ,Integer> ,JpaSpecificationExecutor<Org> {
    List<Org> findByParentId(Integer parentId);

    List<Org> findByOrgName(String orgName);
}
