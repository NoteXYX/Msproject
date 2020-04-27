package com.hfut.action;

import com.hfut.entity.Msmerchant;
import com.hfut.service.MsmerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("msmerchantAction")
public class MsmerchantAction {

    @Autowired
    MsmerchantService msmerchantService;
    @RequestMapping("toadd")
    public String toadd() {
        return "msmerchant/add";
    }

    @RequestMapping("add")
    public void add(Msmerchant msmerchant) {
        msmerchantService.insertMsmerchant(msmerchant);
        System.out.println(msmerchant);
    }
}
