package com.fox.hotspot.db;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/*
 * @Order(1) 代表类的加载顺序，0是第一个加载
 */

@Component
@Aspect
@Order(0)
public class DbInterceptor {

	private static org.slf4j.Logger log = LoggerFactory
			.getLogger(DbInterceptor.class);

	@Before("execution(* com.fox.hotspot.service..*.*(..))")
	public void dynamicSetDataSoruce(JoinPoint joinPoint) throws Exception {
		if (log.isDebugEnabled()) {
			log.debug("go into DbInterceptor..............");
		}
		DataSource dataSource = joinPoint.getTarget().getClass()
				.getAnnotation(DataSource.class);
		dataSource = dataSource == null ? ((MethodSignature) joinPoint
				.getSignature()).getMethod().getAnnotation(DataSource.class)
				: dataSource;
		if (dataSource != null) {
			DataSourceContextHolder.setCustomerType(dataSource.value());
			if (log.isDebugEnabled()) {
				log.debug("change DataSource to:"
						+ DataSourceContextHolder.getCustomerType());
			}
		} else {
			DataSourceContextHolder.clearCustomerType();
		}
	}
}
