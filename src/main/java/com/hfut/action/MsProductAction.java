package com.hfut.action;

import com.hfut.entity.Msproductinfo;
import com.hfut.service.MsproductService;
import com.hfut.vo.msproduct.ConstomProduct;
import com.hfut.vo.msproduct.MsproductVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("msProductAction")
public class MsProductAction {

    @Autowired
    private MsproductService msproductService;

    @RequestMapping(value = "toApplymsproduct")
    public String toApplymsproduct() {
        return "msproductinfo/applymsproduct";
    }

    @RequestMapping(value = "applymsproduct", method = RequestMethod.POST)
    public String applymsproduct(Msproductinfo msproductinfo) {
        msproductService.applymsproduct(msproductinfo);
        System.out.println(msproductinfo);
        return "redirect:listmsproduct";
    }

    @RequestMapping(value = "delmsproductByid")
    public String delmsproductByid(int id) {
        msproductService.delmsproductByid(id);
        return "redirect:listmsproduct";
    }

    @RequestMapping(value = "toupdatemsproduct")
    public String toupdatemsproduct(HttpServletRequest request, int id) {
        Msproductinfo msproductinfo = msproductService.querymsproductByid(id);
        Date starttime = msproductinfo.getStarttime();
        Date endtime = msproductinfo.getEndtime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String starttimeStr = dateFormat.format(starttime);
        String endtimeStr = dateFormat.format(endtime);
        request.setAttribute("msproductinfo", msproductinfo);
        request.setAttribute("starttimeStr", starttimeStr);
        request.setAttribute("endtimeStr", endtimeStr);
        return "msproductinfo/update";
    }

    @RequestMapping(value = "updatemsproduct")
    public String updatemsproduct(Msproductinfo msproductinfo) {
        msproductService.updatemsproduct(msproductinfo);
        return "redirect:listmsproduct";
    }

    @RequestMapping(value = "querymsproductByid")
    public String querymsproductByid(HttpServletRequest request, int id) {
        Msproductinfo msproductinfo = msproductService.querymsproductByid(id);
        request.setAttribute("msproductinfo", msproductinfo);
        return "msproductinfo/view";
    }

    @RequestMapping(value = "listmsproduct")
    public String listmsproduct(HttpServletRequest request, MsproductVo msproductVo) {
        List<Msproductinfo> list = msproductService.listmsproduct(msproductVo);
        request.setAttribute("list", list);
        return "msproductinfo/list";
    }

    @RequestMapping(value = "updatemsproductState")
    public String updatemsproductState(int id, int state) {
        msproductService.updatemsproductState(id, state);
        return "msproductinfo/list";
    }

}