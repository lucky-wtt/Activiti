package com.wt.controller;

import com.alibaba.fastjson.JSONObject;
import com.wt.service.ShangPingService;
import com.wt.vo.ShangPingVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("commodity")
public class ShangPingController {
    @Resource
    ShangPingService shangPingService;
    @RequestMapping(value = "/addpage")
    public String addpage(){
        return "add";
    }
    //新增操作
    @RequestMapping(value = "/add")
    public String add(ShangPingVo shangPingVo){
        shangPingService.shangpingadd(shangPingVo);
        return "redirect:/commodity/echartspage";
    }

    //用echarts的柱状图展示出来
    @RequestMapping(value = "/echartspage")
    public String echartspage(ModelMap modelMap){
        List list = new ArrayList();
        list.add("'product'");

        List<Map> serieslist = shangPingService.selecttypelist();
        for(int a=0;a<serieslist.size();a++){
            List list1 = new ArrayList();
            Map map = serieslist.get(a);
            /*System.out.println(map);*/
            list1.add("'"+map.get("commtype")+"'");
            /*System.out.println(list1);*/
            list1.add(map.get("销量"));
            list.add(list1);
            /*System.out.println("aaaaa:"+list);*/
        }
        modelMap.addAttribute("list",list);
        System.out.println("list:"+list);
        return "echarts";
    }
}