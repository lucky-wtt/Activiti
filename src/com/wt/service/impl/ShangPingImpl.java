package com.wt.service.impl;

import com.wt.dao.BaseDao;
import com.wt.service.ShangPingService;
import com.wt.vo.ShangPingVo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShangPingImpl extends BaseDao implements ShangPingService{

    @Override
    public void shangpingadd(ShangPingVo shangPingVo) {
        add(shangPingVo);
    }

    @Override
    public List selecttypelist() {
        return list("select commtype,sum(commnum) as 销量 from echarts_commodity group by commtype");
    }
}