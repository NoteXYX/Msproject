package com.hfut.vo.msproduct;

import com.hfut.entity.Msproductinfo;

import java.util.Date;

public class ConstomProduct extends Msproductinfo {

    private int startoriginalprice;  //原价格范围开始
    private int endoriginalprice;  //原价格范围结束

    private int startmiaoshaprice;  //秒杀价格范围开始
    private int endmiaoshaprice;  //秒杀价格范围结束

    private Date startapplydate;   //申请时间范围开始
    private Date endapplydate;   //申请时间范围开始

    private Date startauditdate;   //审核时间范围开始
    private Date endauditdate;   //审核时间范围开始

    private Date startstarttime;   //秒杀开始时间范围开始
    private Date endstarttime;   //秒杀开始时间范围开始

    private Date startendtime;   //秒杀结束时间范围开始
    private Date endendtime;   //秒杀结束时间范围开始
}