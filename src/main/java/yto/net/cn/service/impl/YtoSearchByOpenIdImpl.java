package yto.net.cn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yto.net.cn.bean.YtoLogin;
import yto.net.cn.dao.YtoLoginDao;
import yto.net.cn.service.YtoSearchByOpenIdService;

@Service
public class YtoSearchByOpenIdImpl implements YtoSearchByOpenIdService {

    @Autowired
    private YtoLoginDao ytoLoginDao;

    @Override
    public YtoLogin searchByOpenId(String open_id) {
        return ytoLoginDao.searchByOpenId(open_id);
    }
}
