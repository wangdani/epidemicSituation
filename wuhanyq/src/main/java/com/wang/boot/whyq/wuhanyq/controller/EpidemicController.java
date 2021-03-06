package com.wang.boot.whyq.wuhanyq.controller;



import com.wang.boot.whyq.wuhanyq.dto.EpidemicDto;
import com.wang.boot.whyq.wuhanyq.service.CityDataService;
import com.wang.boot.whyq.wuhanyq.service.EpidemicService;
import com.wang.boot.whyq.wuhanyq.tools.PropertyUtils;
import com.wang.boot.whyq.wuhanyq.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

/*
 *@author: Wang He
 *@time: 2020/01/11 15:32
 *@description:
 */
@RestController
@RequestMapping("/epidemic")
@Slf4j
public class EpidemicController {

    @Autowired
    private EpidemicService epidemicService;

    @Autowired
    private CityDataService cityDataService;


    @PostMapping(value = "selectByObject")
    public List<EpidemicDto> selectByObject(EpidemicDto dto){
        List<EpidemicDto> list = epidemicService.selectByObject(dto);
        return list;
    }


    @GetMapping("/total")
    public ModelAndView total(Model model) throws Exception {
        String serverPath= ResourceUtils.getURL("classpath:property").getPath(); 
        log.info(serverPath);
        Map<String,String> m = PropertyUtils.readToMap(serverPath+"/my.properties");
        model.addAttribute("allLjqz", m.get("allLjqz"));
        model.addAttribute("allLjys", m.get("allLjys"));
        model.addAttribute("allLjsw", m.get("allLjsw"));
        model.addAttribute("lastUpDay", m.get("lastDay"));
        model.addAttribute("cityList", cityDataService.listCity());
        return new ModelAndView("yq/yq", "reportModel", model);
    }



}
