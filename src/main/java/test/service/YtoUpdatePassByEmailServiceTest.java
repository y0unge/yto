package test.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import yto.net.cn.service.YtoUpdatePassByEmailService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml" })
public class YtoUpdatePassByEmailServiceTest {
    @Autowired
    YtoUpdatePassByEmailService ytoUpdatePassByEmailService;

    @Test
    public void testYtoUpdatePassByEmail(){
        ytoUpdatePassByEmailService.updatePassByEmail("123456","1234");
    }
}
