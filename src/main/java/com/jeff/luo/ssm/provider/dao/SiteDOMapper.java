package com.jeff.luo.ssm.provider.dao;

import com.jeff.luo.ssm.provider.pojo.dto.SiteDO;

public interface SiteDOMapper {

    SiteDO selectByPrimaryKey(Integer siteId);

}