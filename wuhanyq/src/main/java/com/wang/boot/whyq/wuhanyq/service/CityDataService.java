package com.wang.boot.whyq.wuhanyq.service;

import java.util.List;

import com.wang.boot.whyq.wuhanyq.vo.City;

/*
 *@author: Wang He
 *@time: 2020/01/11 15:38
 *@description:
 */
public interface CityDataService {

	/**
	 * 获取City列表
	 * @return
	 * @throws Exception
	 */
	List<City> listCity() throws Exception;
}
