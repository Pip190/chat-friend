package com.chongdong.mapper;

import com.chongdong.model.Comment;

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

}
