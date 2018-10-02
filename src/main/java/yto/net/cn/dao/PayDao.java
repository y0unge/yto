package yto.net.cn.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yto.net.cn.bean.Pay;
import yto.net.cn.bean.PayQuery;

public interface PayDao {
    int countByExample(PayQuery example);

    int deleteByExample(PayQuery example);

    int deleteByPrimaryKey(Long payId);

    int insert(Pay record);

    int insertSelective(Pay record);

    List<Pay> selectByExample(PayQuery example);

    Pay selectByPrimaryKey(Long payId);

    int updateByExampleSelective(@Param("record") Pay record, @Param("example") PayQuery example);

    int updateByExample(@Param("record") Pay record, @Param("example") PayQuery example);

    int updateByPrimaryKeySelective(Pay record);

    int updateByPrimaryKey(Pay record);
}