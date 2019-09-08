package top.coolidea.bloghomework.service.impl;

import top.coolidea.bloghomework.entity.Comment;
import top.coolidea.bloghomework.mapper.CommentMapper;
import top.coolidea.bloghomework.service.ICommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author weiyien
 * @since 2019-09-08
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements ICommentService {

}
