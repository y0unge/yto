package yto.net.cn.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yto.net.cn.bean.Orderss;
import yto.net.cn.bean.OrderssQuery;

public interface OrderssDao {
    int countByExample(OrderssQuery example);

    int deleteByExample(OrderssQuery example);

    int deleteByPrimaryKey(Long ordersId);

    int insert(Orderss record);

    int insertSelective(Orderss record);

    List<Orderss> selectByExample(OrderssQuery example);

    Orderss selectByPrimaryKey(Long ordersId);

    int updateByExampleSelective(@Param("record") Orderss record, @Param("example") OrderssQuery example);

    int updateByExample(@Param("record") Orderss record, @Param("example") OrderssQuery example);

    int updateByPrimaryKeySelective(Orderss record);

    int updateByPrimaryKey(Orderss record);
}