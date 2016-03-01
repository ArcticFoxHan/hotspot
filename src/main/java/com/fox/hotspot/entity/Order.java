package com.fox.hotspot.entity;

//聚类分析采样数据
public class Order {

	private Long orderId; // 订单编号

	private Integer productTypeId;// 产品类型

	private String city;// 服务城市
	
	//实际
	private Double startLatitude; // 实际开始纬度
	private Double startLongitude; // 实际开始经度
	private Double endLatitude; // 实际结束纬度
	private Double endLongitude; // 实际结束经度

	private Integer startTime;// 实际开始时间
	private Integer endTime;// 实际结束时间
	
	//预期
	private Double expectStartLatitude; // 预期开始纬度
	private Double expectStartLongitude; // 预期开始纬度
	private Double expectEndLatitude; // 预期结束纬度
	private Double expectEndLongitude; // 预期结束纬度

	private Integer expectStartTime;// 预期开始时间
	private Integer expectEndTime;// 预期结束时间

}
