package com.fox.hotspot.db;

import org.slf4j.LoggerFactory;

import com.fox.hotspot.common.DB;

public class DataSourceContextHolder {
	private static org.slf4j.Logger log = LoggerFactory
			.getLogger(DataSourceContextHolder.class);

	private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();

	public static void setCustomerType(String customerType) {
		if (DB.DB_CORE.equals(customerType)) {
			contextHolder.set(customerType);
		} else {
			throw new IllegalArgumentException("Invalid customerType...");
		}
		if (log.isDebugEnabled()) {
			log.debug("change dataSource to:" + getCustomerType());
		}
	}

	public static String getCustomerType() {
		return contextHolder.get();
	}

	public static void clearCustomerType() {
		contextHolder.remove();
	}
}
