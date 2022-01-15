package com.easylearning;

import static java.lang.annotation.ElementType.*;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({TYPE, METHOD, CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
public @interface Info {
	
	public String value() default "";

}
