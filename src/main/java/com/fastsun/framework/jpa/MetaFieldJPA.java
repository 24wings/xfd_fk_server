package com.fastsun.framework.jpa;

import com.fastsun.framework.entity.queryTemplate.MetaField;
import com.fastsun.framework.jpa.base.BaseRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface MetaFieldJPA extends BaseRepository<MetaField, Integer>, JpaSpecificationExecutor<MetaField> {

    /**
     * 根据mataobject中的objectcode 得到字段列表
     **/
    //@Cacheable(value="metafile",key = "#p0")
    List<MetaField> findByObjectCode(String objCode);


    @Transactional
//    @CacheEvict(value = "metafile",key = "#p0")
    void  deleteByObjectCode(String objectCode);
//    @Transactional
//    void  deleteByMetaId(Integer metaId);
}
