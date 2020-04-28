package com.hfut.action;

import com.hfut.entity.Msmerchant;
import com.hfut.service.MsmerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("msmerchantAction")
public class MsmerchantAction {

    @Autowired
    MsmerchantService msmerchantService;

    @RequestMapping("toadd")
    public String toadd() {
        return "msmerchant/add";
    }

    @RequestMapping(value="add", method= RequestMethod.POST)
    public void add(Msmerchant msmerchant) {
        msmerchantService.insertMsmerchant(msmerchant);
        System.out.println(msmerchant);
    }

    @RequestMapping("toupdate")
    public String toupdate(HttpServletRequest request, int id) {
        Msmerchant msmerchant = msmerchantService.queryMsmerchantByid(id);
        request.setAttribute("msmerchant", msmerchant);
        return "msmerchant/update";
    }

    @RequestMapping("update")
    public void update(Msmerchant msmerchant) {
        msmerchantService.updateMsmerchant(msmerchant);
        System.out.println(msmerchant);
    }

    @RequestMapping("del")
    public void del(HttpServletRequest request, int id) {
        msmerchantService.deleteMsmerchantByid(id);
    }

    @RequestMapping("querybyid")
    public String querybyid(HttpServletRequest request, int id) {
        Msmerchant msmerchant = msmerchantService.queryMsmerchantByid(id);
        request.setAttribute("msmerchant", msmerchant);
        return "msmerchant/view";
    }


}