package com.wt.service;

import com.wt.vo.ShangPingVo;

import java.util.List;
import java.util.Map;

public interface ShangPingService {
    //新增
    void shangpingadd(ShangPingVo shangPingVo);
    List<Map> selecttypelist();
}