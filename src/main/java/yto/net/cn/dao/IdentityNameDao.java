package yto.net.cn.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yto.net.cn.bean.IdentityName;
import yto.net.cn.bean.IdentityNameQuery;

public interface IdentityNameDao {
    int countByExample(IdentityNameQuery example);

    int deleteByExample(IdentityNameQuery example);

    int deleteByPrimaryKey(Long identityId);

    int insert(IdentityName record);

    int insertSelective(IdentityName record);

    List<IdentityName> selectByExample(IdentityNameQuery example);

    IdentityName selectByPrimaryKey(Long identityId);

    int updateByExampleSelective(@Param("record") IdentityName record, @Param("example") IdentityNameQuery example);

    int updateByExample(@Param("record") IdentityName record, @Param("example") IdentityNameQuery example);

    int updateByPrimaryKeySelective(IdentityName record);

    int updateByPrimaryKey(IdentityName record);
}