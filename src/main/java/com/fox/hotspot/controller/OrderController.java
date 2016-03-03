package com.fox.hotspot.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.exceptions.PersistenceException;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import com.fox.hotspot.common.Common;
import com.fox.hotspot.lib.Utils;
import com.fox.hotspot.service.OrderService;

@Controller
@RequestMapping(value = "/api/order")
public class OrderController {
	private org.slf4j.Logger logger = LoggerFactory
			.getLogger(OrderController.class);// 日志文件

	@Autowired
	private OrderService orderService;

	/*
	 * @brief  获取订单列表
	 * @param  String city 城市
	 */
	@RequestMapping(value = "/getOrderList", method = RequestMethod.GET)
	public ModelAndView getOrderList(
			@RequestParam(value = "city", defaultValue = "bj", required = false) String city) {
		try {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("city", city);
			List orderList = orderService.getOrderList(params);
			MappingJackson2JsonView view = new MappingJackson2JsonView();
			view.setAttributesMap(Utils.getResultMap(Common.RET_CODE_SUCCESS,
					Common.RET_MSG_SUCCESS, orderList));
			return new ModelAndView(view);
		} catch (IllegalArgumentException e) {
			logger.error(e.getMessage());
			throw new RestException(Common.RET_CODE_PARAM, e.getMessage());
		} catch (PersistenceException e) {
			logger.error(e.getMessage());
			throw new RestException(Common.RET_CODE_DB_ERR, e.getMessage());
		} catch (Exception e) {
			logger.error(e.getMessage());
			throw new RestException(Common.RET_CODE_SYSTEM_ERR, "系统内部错误.");
		}
	}
}
