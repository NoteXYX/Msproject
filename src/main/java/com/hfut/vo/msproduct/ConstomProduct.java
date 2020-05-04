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

    private int minProductcount; //最小一次性购买商品数量
    private int maxProductcount; //最大一次性购买商品数量

    private int minStockcount; //最小库存数量
    private int maxStockcount; //最大库存数量

    public int getStartoriginalprice() {
        return startoriginalprice;
    }

    public void setStartoriginalprice(int startoriginalprice) {
        this.startoriginalprice = startoriginalprice;
    }

    public int getEndoriginalprice() {
        return endoriginalprice;
    }

    public void setEndoriginalprice(int endoriginalprice) {
        this.endoriginalprice = endoriginalprice;
    }

    public int getStartmiaoshaprice() {
        return startmiaoshaprice;
    }

    public void setStartmiaoshaprice(int startmiaoshaprice) {
        this.startmiaoshaprice = startmiaoshaprice;
    }

    public int getEndmiaoshaprice() {
        return endmiaoshaprice;
    }

    public void setEndmiaoshaprice(int endmiaoshaprice) {
        this.endmiaoshaprice = endmiaoshaprice;
    }

    public Date getStartapplydate() {
        return startapplydate;
    }

    public void setStartapplydate(Date startapplydate) {
        this.startapplydate = startapplydate;
    }

    public Date getEndapplydate() {
        return endapplydate;
    }

    public void setEndapplydate(Date endapplydate) {
        this.endapplydate = endapplydate;
    }

    public Date getStartauditdate() {
        return startauditdate;
    }

    public void setStartauditdate(Date startauditdate) {
        this.startauditdate = startauditdate;
    }

    public Date getEndauditdate() {
        return endauditdate;
    }

    public void setEndauditdate(Date endauditdate) {
        this.endauditdate = endauditdate;
    }

    public Date getStartstarttime() {
        return startstarttime;
    }

    public void setStartstarttime(Date startstarttime) {
        this.startstarttime = startstarttime;
    }

    public Date getEndstarttime() {
        return endstarttime;
    }

    public void setEndstarttime(Date endstarttime) {
        this.endstarttime = endstarttime;
    }

    public Date getStartendtime() {
        return startendtime;
    }

    public void setStartendtime(Date startendtime) {
        this.startendtime = startendtime;
    }

    public Date getEndendtime() {
        return endendtime;
    }

    public void setEndendtime(Date endendtime) {
        this.endendtime = endendtime;
    }

    public int getMinProductcount() {
        return minProductcount;
    }

    public void setMinProductcount(int minProductcount) {
        this.minProductcount = minProductcount;
    }

    public int getMaxProductcount() {
        return maxProductcount;
    }

    public void setMaxProductcount(int maxProductcount) {
        this.maxProductcount = maxProductcount;
    }

    public int getMinStockcount() {
        return minStockcount;
    }

    public void setMinStockcount(int minStockcount) {
        this.minStockcount = minStockcount;
    }

    public int getMaxStockcount() {
        return maxStockcount;
    }

    public void setMaxStockcount(int maxStockcount) {
        this.maxStockcount = maxStockcount;
    }
}