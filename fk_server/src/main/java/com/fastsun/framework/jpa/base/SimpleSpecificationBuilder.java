package com.fastsun.framework.jpa.base;

import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;

public class SimpleSpecificationBuilder<T> {
    //条件列表
    private List<SpecificationOperator> opers;

    //构造函数，初始化的条件是and
    public SimpleSpecificationBuilder(String key,String oper,Object value) {
        SpecificationOperator so = new SpecificationOperator();
        so.setJoin("and");
        so.setKey(key);
        so.setOper(oper);
        so.setValue(value);
        opers = new ArrayList<SpecificationOperator>();
        opers.add(so);
    }

    public SimpleSpecificationBuilder() {
        opers = new ArrayList<SpecificationOperator>();
    }

    public SimpleSpecificationBuilder add(String key,String oper,Object value,String join) {
        SpecificationOperator so = new SpecificationOperator();
        so.setKey(key);
        so.setValue(value);
        so.setOper(oper);
        so.setJoin(join);
        opers.add(so);
        return this;
    }
    public SimpleSpecificationBuilder addOr(String key,String oper,Object value) {
        return this.add(key,oper,value,"or");
    }
    public SimpleSpecificationBuilder add(String key,String oper,Object value) {
        return this.add(key,oper,value,"and");
    }

    public Specification generateSpecification() {
        Specification<T> specification = new SimpleSpecification<T>(opers);
        return specification;
    }

}
