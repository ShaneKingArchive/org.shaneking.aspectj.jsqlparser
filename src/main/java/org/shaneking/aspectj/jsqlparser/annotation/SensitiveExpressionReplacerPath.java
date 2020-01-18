package org.shaneking.aspectj.jsqlparser.annotation;

import org.shaneking.skava.lang.String0;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface SensitiveExpressionReplacerPath {
  String value() default String0.EMPTY;
}
