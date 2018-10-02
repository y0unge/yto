package yto.net.cn.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yto.net.cn.bean.Signin;
import yto.net.cn.bean.SigninQuery;

public interface SigninDao {
    int countByExample(SigninQuery example);

    int deleteByExample(SigninQuery example);

    int deleteByPrimaryKey(Long signinId);

    int insert(Signin record);

    int insertSelective(Signin record);

    List<Signin> selectByExample(SigninQuery example);

    Signin selectByPrimaryKey(Long signinId);

    int updateByExampleSelective(@Param("record") Signin record, @Param("example") SigninQuery example);

    int updateByExample(@Param("record") Signin record, @Param("example") SigninQuery example);

    int updateByPrimaryKeySelective(Signin record);

    int updateByPrimaryKey(Signin record);
}