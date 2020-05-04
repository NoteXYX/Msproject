package com.hfut.service;

import com.hfut.dao.MsproductDao;
import com.hfut.entity.Msproductinfo;
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

}
