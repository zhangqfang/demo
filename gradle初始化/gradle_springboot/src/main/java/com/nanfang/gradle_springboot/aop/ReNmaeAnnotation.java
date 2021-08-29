package com.nanfang.gradle_springboot.aop;

import java.lang.annotation.*;
import java.util.PrimitiveIterator;
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Inherited
public @interface ReNmaeAnnotation {
  public boolean needException()default false;
}
