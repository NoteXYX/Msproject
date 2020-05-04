package com.hfut.action;

import com.hfut.entity.Msproductinfo;
import com.hfut.service.MsproductService;
import com.hfut.vo.msproduct.MsproductVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
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
    public void applymsproduct(Msproductinfo msproductinfo) {
        msproductService.applymsproduct(msproductinfo);
        System.out.println(msproductinfo);
    }

    @RequestMapping(value = "listmsproduct")
    public String listmsproduct(HttpServletRequest request, MsproductVo msproductVo) {
        List<Msproductinfo> list = msproductService.listmsproduct(msproductVo);
        request.setAttribute("list", list);
        return "msproductinfo/list";
    }

}