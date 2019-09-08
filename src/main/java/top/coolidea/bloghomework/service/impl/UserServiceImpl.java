package top.coolidea.bloghomework.service.impl;

import top.coolidea.bloghomework.entity.User;
import top.coolidea.bloghomework.mapper.UserMapper;
import top.coolidea.bloghomework.service.IUserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
