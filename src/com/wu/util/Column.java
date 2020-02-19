package com.wu.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)//FIELD属性上  TYPE 类上  METHOD  fangfasahng
@Retention(RetentionPolicy.RUNTIME)//生命周期   整个运行中都有效
public @interface Column {
    String value();
}
