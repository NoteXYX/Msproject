package com.hfut.dao;

import com.hfut.entity.Msproductinfo;
import com.hfut.vo.msproduct.MsproductVo;

import java.util.List;

public interface MsproductDao {

    public void applymsproduct(Msproductinfo msproductinfo);    //申请秒杀商品
    public void delmsproductByid(int id);    //根据id删除秒杀商品
    public void updatemsproduct(Msproductinfo msproductinfo);    //修改更新秒杀商品
    public Msproductinfo querymsproductByid(int id);    //根据id查询秒杀商品
    public List<Msproductinfo> listmsproduct(MsproductVo msproductVo);    //批量查询秒杀商品
    public void updatemsproductState(MsproductVo msproductVo);    //修改更新秒杀商品的审核状态

}
