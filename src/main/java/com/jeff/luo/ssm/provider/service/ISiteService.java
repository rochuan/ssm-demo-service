package com.jeff.luo.ssm.provider.service;

import com.jeff.luo.ssm.provider.pojo.dto.SiteDO;
import org.springframework.stereotype.Service;

public interface ISiteService {

    SiteDO findSite(Integer siteId);
}
