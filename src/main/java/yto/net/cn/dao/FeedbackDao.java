package yto.net.cn.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yto.net.cn.bean.Feedback;
import yto.net.cn.bean.FeedbackQuery;

public interface FeedbackDao {
    int countByExample(FeedbackQuery example);

    int deleteByExample(FeedbackQuery example);

    int deleteByPrimaryKey(Long feedbackId);

    int insert(Feedback record);

    int insertSelective(Feedback record);

    List<Feedback> selectByExampleWithBLOBs(FeedbackQuery example);

    List<Feedback> selectByExample(FeedbackQuery example);

    Feedback selectByPrimaryKey(Long feedbackId);

    int updateByExampleSelective(@Param("record") Feedback record, @Param("example") FeedbackQuery example);

    int updateByExampleWithBLOBs(@Param("record") Feedback record, @Param("example") FeedbackQuery example);

    int updateByExample(@Param("record") Feedback record, @Param("example") FeedbackQuery example);

    int updateByPrimaryKeySelective(Feedback record);

    int updateByPrimaryKeyWithBLOBs(Feedback record);

    int updateByPrimaryKey(Feedback record);
}