package com.chongdong.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 评论表
 * @TableName tcd_comment
 */
@Data
public class Comment implements Serializable {
    /**
     * 评论id
     */
    private Integer commentId;

    /**
     * 评论内容
     */
    private String commentContent;

    /**
     * 评论人id
     */
    private Integer userId;

    /**
     * 在哪篇文章（动态）下评论的
     */
    private Integer trendsId;

    /**
     * 评论是否非法 1(非法)，0(合法)
     */
    private Integer illegal;

    /**
     * 父级评论id
     */
    private Integer parentCommentId;

    /**
     * 父级评论的user_id
     */
    private Integer parentCommentUserId;

    /**
     * 被回复的评论id
     */
    private Integer replyCommentId;

    /**
     * 被回复的评论的user_id
     */
    private Integer replyCommentUserId;

    /**
     * 评论等级[ 1 一级评论 默认 ，2 二级评论]
     */
    private Integer commentLevel;

    /**
     * 评论的点赞数量
     */
    private Integer praiseNum;

    /**
     * 置顶状态[ 1 置顶，0 不置顶 默认 ]
     */
    private Integer topStatus;

    /**
     * 创建时间
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;
}