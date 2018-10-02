package yto.net.cn.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yto.net.cn.bean.Announcement;
import yto.net.cn.bean.AnnouncementQuery;

public interface AnnouncementDao {
    int countByExample(AnnouncementQuery example);

    int deleteByExample(AnnouncementQuery example);

    int deleteByPrimaryKey(Long announcementId);

    int insert(Announcement record);

    int insertSelective(Announcement record);

    List<Announcement> selectByExampleWithBLOBs(AnnouncementQuery example);

    List<Announcement> selectByExample(AnnouncementQuery example);

    Announcement selectByPrimaryKey(Long announcementId);

    int updateByExampleSelective(@Param("record") Announcement record, @Param("example") AnnouncementQuery example);

    int updateByExampleWithBLOBs(@Param("record") Announcement record, @Param("example") AnnouncementQuery example);

    int updateByExample(@Param("record") Announcement record, @Param("example") AnnouncementQuery example);

    int updateByPrimaryKeySelective(Announcement record);

    int updateByPrimaryKeyWithBLOBs(Announcement record);

    int updateByPrimaryKey(Announcement record);
}