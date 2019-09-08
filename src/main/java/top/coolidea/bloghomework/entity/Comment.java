package top.coolidea.bloghomework.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author weiyien
 * @since 2019-09-08
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Comment extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 评论的内容
     */
    private String content;

    /**
     * 回复的评论ID
     */
    private Long parentId;

    /**
     * 评论的内容ID
     */
    private Long postId;

    /**
     * 评论的用户ID
     */
    private Long userId;

    /**
     * “顶”的数量
     */
    private Integer voteUp;

    /**
     * “踩”的数量
     */
    private Integer voteDown;

    /**
     * 置顶等级
     */
    private Integer level;

    /**
     * 评论的状态
     */
    private Integer status;

    /**
     * 评论的时间
     */
    private LocalDateTime created;

    /**
     * 评论的更新时间
     */
    private LocalDateTime modified;


}
