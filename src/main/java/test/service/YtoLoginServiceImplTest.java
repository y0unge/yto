package test.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import yto.net.cn.bean.YtoLogin;
import yto.net.cn.service.YtoLoginService;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml" })
public class YtoLoginServiceImplTest {

    @Autowired
    private YtoLoginService ytoLoginService;

    @Test
    public void testInsert(){
        YtoLogin ytoLogin = new YtoLogin();
        ytoLogin.setCreateTime(new Date());
        ytoLogin.setHeaderUrl("dddd");
        ytoLogin.setLoginPassword("123");
        ytoLogin.setLoginPhoneNumber(1234256L);
        ytoLogin.setUpdateTime(new Date());
        ytoLogin.setWechatOpenid("12fedxs45");
        ytoLogin.setUserType(1);
        ytoLogin.setLoginUsername("tasdt123");
        int num = ytoLoginService.insert(ytoLogin);
        System.out.println("num = " + num);
    }
}
