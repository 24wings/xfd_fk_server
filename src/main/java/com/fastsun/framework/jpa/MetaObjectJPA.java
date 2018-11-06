package com.fastsun.framework.jpa;

import com.fastsun.framework.entity.queryTemplate.MetaObject;
import com.fastsun.framework.jpa.base.BaseRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.transaction.annotation.Transactional;


public interface MetaObjectJPA extends BaseRepository<MetaObject,Integer>,JpaSpecificationExecutor<MetaObject> {
    /** 根据查询名称对应code得到 元对象  **/
    //@Cacheable(value = "metaObject",key = "#p0")
    MetaObject findByObjectCode(String objectCode);

    @Transactional
    //@CacheEvict(value = "metaObject",key = "#p0")
    void deleteByObjectCode(String  objectCode);

    //@CachePut(value = "metaObject",key = "#metaObject.objectCode")
    MetaObject saveAndFlush(MetaObject metaObject);

    //@CachePut(value = "metaObject",key = "#metaObject.objectCode")
    MetaObject save(MetaObject metaObject);
}
