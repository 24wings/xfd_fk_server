package com.fastsun.framework.jpa.base;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public class SimplePageBuilder {

    public static final int size = 15;

    public static Pageable generate(int page, int size, Sort sort) {
        if(sort==null) return PageRequest.of(page, size);
        return PageRequest.of(page, size, sort);
    }

    public static Pageable generate(int page) {
        return generate(page,size,null);
    }

    public static Pageable generate(int page,Sort sort) {
        return generate(page,size,sort);
    }

}
