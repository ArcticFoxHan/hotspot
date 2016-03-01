package com.fox.hotspot.db;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class Db extends AbstractRoutingDataSource {

	public Db(DataSourceFactory dsf) {
		this.setDefaultTargetDataSource(dsf.getCore());
		this.setTargetDataSources(dsf.getTargetDataSources());
	}

	@Override
	protected Object determineCurrentLookupKey() {
		return DataSourceContextHolder.getCustomerType();
	}
}
