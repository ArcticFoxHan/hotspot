package com.fox.hotspot.lib;

public class Distance {

	// 获取两点欧拉距离
	public static double getOlaDis(Double lat1, Double lon1, Double lat2,
			Double lon2) {
		return Math.sqrt(Math.pow((lat1 - lat2), 2)
				+ Math.pow((lon1 - lon2), 2));
	}
}