package com.fastsun.framework.jpa;

import com.fastsun.framework.entity.rbac.Menu;
import com.fastsun.framework.jpa.base.BaseRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface MenuJPA extends BaseRepository<Menu, Integer>, JpaSpecificationExecutor<Menu> {

    List<Menu> findByMenuIdIn(int[] menus);

    Menu findByMenuCode(String menuCode);
}
