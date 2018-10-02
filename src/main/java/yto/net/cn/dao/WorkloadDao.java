package yto.net.cn.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yto.net.cn.bean.Workload;
import yto.net.cn.bean.WorkloadQuery;

public interface WorkloadDao {
    int countByExample(WorkloadQuery example);

    int deleteByExample(WorkloadQuery example);

    int deleteByPrimaryKey(Long workloadId);

    int insert(Workload record);

    int insertSelective(Workload record);

    List<Workload> selectByExample(WorkloadQuery example);

    Workload selectByPrimaryKey(Long workloadId);

    int updateByExampleSelective(@Param("record") Workload record, @Param("example") WorkloadQuery example);

    int updateByExample(@Param("record") Workload record, @Param("example") WorkloadQuery example);

    int updateByPrimaryKeySelective(Workload record);

    int updateByPrimaryKey(Workload record);
}