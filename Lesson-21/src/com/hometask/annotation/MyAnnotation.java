package com.hometask.annotation;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

@Retention(RUNTIME)
public @interface MyAnnotation {
	String params() default "   ";

}
