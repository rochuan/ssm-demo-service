package com.jeff.luo.ssm.provider.service.impl;

import com.jeff.luo.ssm.provider.dao.SiteDOMapper;
import com.jeff.luo.ssm.provider.pojo.dto.SiteDO;
import com.jeff.luo.ssm.provider.service.ISiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("iSiteServiceImpl")
public class ISiteServiceImpl implements ISiteService {

    @Autowired
    private SiteDOMapper siteDOMapper;


    public SiteDO findSite(Integer siteId) {
        return siteDOMapper.selectByPrimaryKey(siteId);
    }
}
