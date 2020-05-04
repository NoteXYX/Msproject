package com.hfut.dao;

import com.hfut.entity.Msproductinfo;
import com.hfut.vo.msproduct.MsproductVo;

public interface MsproductDao {

    public void applymsproduct(Msproductinfo msproductinfo);    //申请秒杀商品
    public void listmsproduct(MsproductVo msproductVo);    //批量查询秒杀商品

}
