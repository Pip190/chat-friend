package com.chongdong.mapper;

import com.chongdong.model.Comment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author ASUS
* @description 针对表【tcd_comment(评论表)】的数据库操作Mapper
* @createDate 2023-08-24 11:11:32
* @Entity com.chongdong.model.Comment
*/
public interface CommentMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Comment record);

    int insertSelective(Comment record);

    Comment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);

    List<Comment> selectAll();
    List<Comment> selectByTrendsIdAndCommentLevelOrderByTopStatusDescAndCreateTimeDesc(@Param("trendsId") Integer trendsId, @Param("commentLevel") Integer commentLevel);

    List<Comment> selectByParentCommentIdAndTrendsIdAndCommentLevelOrderByCreateTimeDesc(@Param("parentCommentId") Integer parentCommentId, @Param("trendsId") Integer trendsId, @Param("commentLevel") Integer commentLevel);

    int updatePraiseNumByCommentId(@Param("commentId") Integer commentId, @Param("praiseNum") Integer praiseNum);

}
