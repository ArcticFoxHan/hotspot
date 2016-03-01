package com.fox.hotspot.db;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/*
 * 在service上通过注解指定mapper使用到那些库
 */
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface DataSource {
	String value();
}
