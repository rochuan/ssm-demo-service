package com.jeff.luo.ssm;


import com.jeff.luo.ssm.provider.pojo.dto.SiteDO;
import com.jeff.luo.ssm.provider.service.ISiteService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)        //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring/spring*.xml"})

public class TestISiteService {

    @Autowired
    private ISiteService iSiteService;

    @Test
    public void test1() {

        SiteDO siteDO = iSiteService.findSite(1);
        System.out.printf("数据结果:" + siteDO.toString());
    }


}