package com.fastsun.framework.entity.queryTemplate;

import java.lang.annotation.*;

@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})//次注解作用于类和字段上
public @interface EntityMetaData {
    String objectName() default "";
    String defaultOrder() default "";
    String config() default "";
    String groupName() default "";
    String pkKey();
    String parentKey() default "";
}
