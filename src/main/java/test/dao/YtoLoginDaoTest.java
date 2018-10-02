package test.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import yto.net.cn.bean.YtoLogin;
import yto.net.cn.dao.YtoLoginDao;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class YtoLoginDaoTest {

    @Autowired
    private YtoLoginDao ytoLoginDao;

    @Test
    public void testInsert(){
        YtoLogin ytoLogin = new YtoLogin();
        ytoLogin.setCreateTime(new Date());
        ytoLogin.setHeaderUrl("test");
        ytoLogin.setLoginPassword("123");
        ytoLogin.setLoginPhoneNumber(1234556L);
        ytoLogin.setUpdateTime(new Date());
        ytoLogin.setWechatOpenid("12243545");
        ytoLogin.setUserType(1);
        ytoLogin.setLoginUsername("test123");
        int num = ytoLoginDao.insert(ytoLogin);
        System.out.println("num = " + num);
    }

}
