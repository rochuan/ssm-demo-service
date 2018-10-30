package com.jeff.luo.ssm.provider.controller;

import com.jeff.luo.ssm.provider.pojo.dto.SiteDO;
import com.jeff.luo.ssm.provider.service.ISiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/site")
public class SiteController {

    @Autowired
    private ISiteService iSiteService;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String getSite(@RequestParam("siteId") int siteId , Map model) {
        SiteDO siteDO = iSiteService.findSite(siteId);
        if (null == siteDO) {
            return null;
        }
        System.out.println("site:" + siteDO.toString());
        model.put("siteDO", siteDO);
        return "index";
    }
}
