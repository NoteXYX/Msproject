package com.hfut.service;

import com.hfut.dao.MsproductDao;
import com.hfut.entity.Msproductinfo;
import com.hfut.vo.msproduct.ConstomProduct;
import com.hfut.vo.msproduct.MsproductVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class MsproductService {

    @Autowired
    MsproductDao msproductDao;

    public void applymsproduct(Msproductinfo msproductinfo) {   //申请秒杀商品
        String starttimeStr =  msproductinfo.getStarttimeStr();
        String endtimeStr = msproductinfo.getEndtimeStr();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date starttime =  dateFormat.parse(starttimeStr);
            msproductinfo.setStarttime(starttime);
            Date endtime =  dateFormat.parse(endtimeStr);
            msproductinfo.setEndtime(endtime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        msproductinfo.setApplydate(new Date());
        msproductinfo.setAuditstate(1);
        msproductDao.applymsproduct(msproductinfo);
    }

    public void delmsproductByid(int id) {  //根据id删除秒杀商品
        msproductDao.delmsproductByid(id);
    }

    public void updatemsproduct(Msproductinfo msproductinfo) {  //修改更新秒杀商品
        msproductDao.updatemsproduct(msproductinfo);
    }
    public Msproductinfo querymsproductByid(int id) {   //根据商品id查询秒杀商品
        return msproductDao.querymsproductByid(id);
    }

    public List<Msproductinfo> listmsproduct(MsproductVo msproductVo) {    //批量查询秒杀商品
        return msproductDao.listmsproduct(msproductVo);
    }

    public void updatemsproductState(int id, int state) {   //修改更新秒杀商品的审核状态
        ConstomProduct constomProduct = new ConstomProduct();
        constomProduct.setId(id);
        constomProduct.setAuditstate(state);
        MsproductVo msproductVo = new MsproductVo();
        msproductVo.setConstomProduct(constomProduct);
        msproductDao.updatemsproductState(msproductVo);
    }

}
