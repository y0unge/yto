package yto.net.cn.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yto.net.cn.bean.Rewards;
import yto.net.cn.bean.RewardsQuery;

public interface RewardsDao {
    int countByExample(RewardsQuery example);

    int deleteByExample(RewardsQuery example);

    int deleteByPrimaryKey(Long rewardsId);

    int insert(Rewards record);

    int insertSelective(Rewards record);

    List<Rewards> selectByExampleWithBLOBs(RewardsQuery example);

    List<Rewards> selectByExample(RewardsQuery example);

    Rewards selectByPrimaryKey(Long rewardsId);

    int updateByExampleSelective(@Param("record") Rewards record, @Param("example") RewardsQuery example);

    int updateByExampleWithBLOBs(@Param("record") Rewards record, @Param("example") RewardsQuery example);

    int updateByExample(@Param("record") Rewards record, @Param("example") RewardsQuery example);

    int updateByPrimaryKeySelective(Rewards record);

    int updateByPrimaryKeyWithBLOBs(Rewards record);

    int updateByPrimaryKey(Rewards record);
}