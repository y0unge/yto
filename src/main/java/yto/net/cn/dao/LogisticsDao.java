package yto.net.cn.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yto.net.cn.bean.Logistics;
import yto.net.cn.bean.LogisticsQuery;

public interface LogisticsDao {
    int countByExample(LogisticsQuery example);

    int deleteByExample(LogisticsQuery example);

    int deleteByPrimaryKey(Long logisticsId);

    int insert(Logistics record);

    int insertSelective(Logistics record);

    List<Logistics> selectByExample(LogisticsQuery example);

    Logistics selectByPrimaryKey(Long logisticsId);

    int updateByExampleSelective(@Param("record") Logistics record, @Param("example") LogisticsQuery example);

    int updateByExample(@Param("record") Logistics record, @Param("example") LogisticsQuery example);

    int updateByPrimaryKeySelective(Logistics record);

    int updateByPrimaryKey(Logistics record);
}