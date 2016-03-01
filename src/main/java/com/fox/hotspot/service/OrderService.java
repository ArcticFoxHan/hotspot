package com.fox.hotspot.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fox.hotspot.db.DataSource;
import com.fox.hotspot.entity.Order;
import com.fox.hotspot.mapper.OrderMapper;

@Component
public class OrderService {

	@Autowired
	private OrderMapper orderMapper;

	@DataSource("core")
	public List<Order> getOrderList(Map<String, Object> params) {
		return orderMapper.getOrderList(params);
	}
}
