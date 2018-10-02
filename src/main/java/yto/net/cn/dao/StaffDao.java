package yto.net.cn.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yto.net.cn.bean.Staff;
import yto.net.cn.bean.StaffQuery;

public interface StaffDao {
    int countByExample(StaffQuery example);

    int deleteByExample(StaffQuery example);

    int deleteByPrimaryKey(Long staffId);

    int insert(Staff record);

    int insertSelective(Staff record);

    List<Staff> selectByExample(StaffQuery example);

    Staff selectByPrimaryKey(Long staffId);

    int updateByExampleSelective(@Param("record") Staff record, @Param("example") StaffQuery example);

    int updateByExample(@Param("record") Staff record, @Param("example") StaffQuery example);

    int updateByPrimaryKeySelective(Staff record);

    int updateByPrimaryKey(Staff record);
}