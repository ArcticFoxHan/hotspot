package com.fox.hotspot.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.fox.hotspot.entity.Order;

public interface OrderMapper {
	// 获取订单列表
	List<Order> getOrderList(@Param("params") Map<String, Object> params);
}