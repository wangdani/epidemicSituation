package com.wang.boot.whyq.wuhanyq.service;

/*
 *@author: Wang He
 *@time: 2020/01/11 17:27
 *@description:
 */

import com.wang.boot.whyq.wuhanyq.dto.EpidemicDto;

import java.util.List;

public interface EpidemicService {
    public List<EpidemicDto> selectByObject(EpidemicDto dto);
    public int insertByObject(EpidemicDto dto);
    public int deleteByObject(EpidemicDto dto);
    public int insertAll(String date);
}
