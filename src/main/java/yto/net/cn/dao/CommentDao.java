package yto.net.cn.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yto.net.cn.bean.Comment;
import yto.net.cn.bean.CommentQuery;

public interface CommentDao {
    int countByExample(CommentQuery example);

    int deleteByExample(CommentQuery example);

    int deleteByPrimaryKey(Long commentId);

    int insert(Comment record);

    int insertSelective(Comment record);

    List<Comment> selectByExampleWithBLOBs(CommentQuery example);

    List<Comment> selectByExample(CommentQuery example);

    Comment selectByPrimaryKey(Long commentId);

    int updateByExampleSelective(@Param("record") Comment record, @Param("example") CommentQuery example);

    int updateByExampleWithBLOBs(@Param("record") Comment record, @Param("example") CommentQuery example);

    int updateByExample(@Param("record") Comment record, @Param("example") CommentQuery example);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKeyWithBLOBs(Comment record);

    int updateByPrimaryKey(Comment record);
}