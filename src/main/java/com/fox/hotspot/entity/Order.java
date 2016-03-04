package com.fox.hotspot.entity;

//聚类分析采样数据
public class Order {

	private Long serviceOrderId; // 订单编号

	private Integer productTypeId;// 产品类型

	private String city;// 服务城市

	// 实际
	private Double startLatitude; // 实际开始纬度
	private Double startLongitude; // 实际开始经度
	private Double endLatitude; // 实际结束纬度
	private Double endLongitude; // 实际结束经度

	private Integer startTime;// 实际开始时间
	private Integer endTime;// 实际结束时间

	// 预期
	private Double expectStartLatitude; // 预期开始纬度
	private Double expectStartLongitude; // 预期开始纬度
	private Double expectEndLatitude; // 预期结束纬度
	private Double expectEndLongitude; // 预期结束纬度

	private Integer expectStartTime;// 预期开始时间
	private Integer expectEndTime;// 预期结束时间

	public Long getServiceOrderId() {
		return serviceOrderId;
	}

	public void setServiceOrderId(Long serviceOrderId) {
		this.serviceOrderId = serviceOrderId;
	}

	public Integer getProductTypeId() {
		return productTypeId;
	}

	public void setProductTypeId(Integer productTypeId) {
		this.productTypeId = productTypeId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Double getStartLatitude() {
		return startLatitude;
	}

	public void setStartLatitude(Double startLatitude) {
		this.startLatitude = startLatitude;
	}

	public Double getStartLongitude() {
		return startLongitude;
	}

	public void setStartLongitude(Double startLongitude) {
		this.startLongitude = startLongitude;
	}

	public Double getEndLatitude() {
		return endLatitude;
	}

	public void setEndLatitude(Double endLatitude) {
		this.endLatitude = endLatitude;
	}

	public Double getEndLongitude() {
		return endLongitude;
	}

	public void setEndLongitude(Double endLongitude) {
		this.endLongitude = endLongitude;
	}

	public Integer getStartTime() {
		return startTime;
	}

	public void setStartTime(Integer startTime) {
		this.startTime = startTime;
	}

	public Integer getEndTime() {
		return endTime;
	}

	public void setEndTime(Integer endTime) {
		this.endTime = endTime;
	}

	public Double getExpectStartLatitude() {
		return expectStartLatitude;
	}

	public void setExpectStartLatitude(Double expectStartLatitude) {
		this.expectStartLatitude = expectStartLatitude;
	}

	public Double getExpectStartLongitude() {
		return expectStartLongitude;
	}

	public void setExpectStartLongitude(Double expectStartLongitude) {
		this.expectStartLongitude = expectStartLongitude;
	}

	public Double getExpectEndLatitude() {
		return expectEndLatitude;
	}

	public void setExpectEndLatitude(Double expectEndLatitude) {
		this.expectEndLatitude = expectEndLatitude;
	}

	public Double getExpectEndLongitude() {
		return expectEndLongitude;
	}

	public void setExpectEndLongitude(Double expectEndLongitude) {
		this.expectEndLongitude = expectEndLongitude;
	}

	public Integer getExpectStartTime() {
		return expectStartTime;
	}

	public void setExpectStartTime(Integer expectStartTime) {
		this.expectStartTime = expectStartTime;
	}

	public Integer getExpectEndTime() {
		return expectEndTime;
	}

	public void setExpectEndTime(Integer expectEndTime) {
		this.expectEndTime = expectEndTime;
	}
}
