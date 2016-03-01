package com.fox.hotspot.db;

import java.util.HashMap;
import java.util.Map;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.slf4j.LoggerFactory;
import com.fox.hotspot.common.DB;

public class DataSourceFactory {
	private DataSource core;// yidao_online service_order
	private Map<Object, Object> targetDataSources;
	private org.slf4j.Logger log = LoggerFactory
			.getLogger(DataSourceFactory.class);

	public Map<Object, Object> getTargetDataSources() {
		return targetDataSources;
	}

	public void setTargetDataSources(Map<Object, Object> targetDataSources) {
		this.targetDataSources = targetDataSources;
	}

	public void initDataSource() {
		Map<Object, Object> targetDataSources = new HashMap<Object, Object>();
		targetDataSources.put(DB.DB_CORE, this.core);
		this.setTargetDataSources(targetDataSources);
	}

	public DataSource getCore() {
		return core;
	}

	public void setCore(DataSource core) {
		this.core = core;
	}
}
