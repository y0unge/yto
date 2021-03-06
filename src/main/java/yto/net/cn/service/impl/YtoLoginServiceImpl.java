package yto.net.cn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yto.net.cn.bean.YtoLogin;
import yto.net.cn.dao.YtoLoginDao;
import yto.net.cn.service.YtoLoginService;

@Service
public class YtoLoginServiceImpl implements YtoLoginService {

    @Autowired
    private YtoLoginDao ytoLoginDao;

    @Override
    public YtoLogin login(String phone, String password) {
        return ytoLoginDao.selectByPhonePass(phone, password);
    }
}
