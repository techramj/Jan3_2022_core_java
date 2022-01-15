package com.easylearning;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Documented
@Target(ElementType.CONSTRUCTOR)
public @interface MyContructAnno {
	
	String value() default "";

}
