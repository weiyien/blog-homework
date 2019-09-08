package top.coolidea.bloghomework.service.impl;

import top.coolidea.bloghomework.entity.Post;
import top.coolidea.bloghomework.mapper.PostMapper;
import top.coolidea.bloghomework.service.IPostService;
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
public class PostServiceImpl extends ServiceImpl<PostMapper, Post> implements IPostService {

}
