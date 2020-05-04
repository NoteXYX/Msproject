package com.hfut.entity;

import java.util.Date;

/**
 * 秒杀商品信息
 */
public class Msproductinfo {
    private int id;         //主键
    private int productid;  //商品id
    private String producttitle;//商品标题
    private String productpic;  //商品图片地址
    private int originalprice;  //原价格
    private int miaoshaprice;   //秒杀价格
    private int merchantid; //商家id
    private Date applydate;  //添加时间
    private Date auditdate; //审核时间
    private int auditstate; //审核状态: 1代表未审核、2代表审核通过、3代表审核不通过
    private Date starttime; //秒杀开始时间
    private Date endtime;   //秒杀结束时间
    private String starttimeStr; //秒杀开始时间String
    private String endtimeStr;   //秒杀结束时间String
    private int productcount;//商品数量
    private int stockcount; //剩余库存数
    private String description;//商品描述

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public String getProducttitle() {
        return producttitle;
    }

    public void setProducttitle(String producttitle) {
        this.producttitle = producttitle;
    }

    public String getProductpic() {
        return productpic;
    }

    public void setProductpic(String productpic) {
        this.productpic = productpic;
    }

    public int getOriginalprice() {
        return originalprice;
    }

    public void setOriginalprice(int originalprice) {
        this.originalprice = originalprice;
    }

    public int getMiaoshaprice() {
        return miaoshaprice;
    }

    public void setMiaoshaprice(int miaoshaprice) {
        this.miaoshaprice = miaoshaprice;
    }

    public int getMerchantid() {
        return merchantid;
    }

    public void setMerchantid(int merchantid) {
        this.merchantid = merchantid;
    }

    public Date getApplydate() {
        return applydate;
    }

    public void setApplydate(Date applydate) {
        this.applydate = applydate;
    }

    public Date getAuditdate() {
        return auditdate;
    }

    public void setAuditdate(Date auditdate) {
        this.auditdate = auditdate;
    }

    public int getAuditstate() {
        return auditstate;
    }

    public void setAuditstate(int auditstate) {
        this.auditstate = auditstate;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getStarttimeStr() {
        return starttimeStr;
    }

    public void setStarttimeStr(String starttimeStr) {
        this.starttimeStr = starttimeStr;
    }

    public String getEndtimeStr() {
        return endtimeStr;
    }

    public void setEndtimeStr(String endtimeStr) {
        this.endtimeStr = endtimeStr;
    }

    public int getProductcount() {
        return productcount;
    }

    public void setProductcount(int productcount) {
        this.productcount = productcount;
    }

    public int getStockcount() {
        return stockcount;
    }

    public void setStockcount(int stockcount) {
        this.stockcount = stockcount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Msproductinfo{" +
                "id=" + id +
                ", productid=" + productid +
                ", producttitle='" + producttitle + '\'' +
                ", productpic='" + productpic + '\'' +
                ", originalprice=" + originalprice +
                ", miaoshaprice=" + miaoshaprice +
                ", merchantid=" + merchantid +
                ", applydate=" + applydate +
                ", auditdate=" + auditdate +
                ", auditstate=" + auditstate +
                ", starttime=" + starttime +
                ", endtime=" + endtime +
                ", productcount=" + productcount +
                ", stockcount=" + stockcount +
                ", description='" + description + '\'' +
                '}';
    }
}
