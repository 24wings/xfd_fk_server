package com.fastsun.framework.entity.queryTemplate;

import java.lang.annotation.*;

@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})//次注解作用于类和字段上
public @interface FieldMetaData {
    int recno() default 0;
    String alias() default "";
    String placeholder() default "";
    String presetValue() default "";
    String config() default "";
    int displayWidth() default 50;
    boolean isQuery() default false;
    boolean isShow() default true;
    boolean isUpdate() default true;
}
