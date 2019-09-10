package top.coolidea.bloghomework.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import top.coolidea.bloghomework.entity.User;
import top.coolidea.bloghomework.mapper.UserMapper;
import top.coolidea.bloghomework.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getByUserName(String username) {
        return userMapper.getByUserName(username);
    }

    @Override
    public List<User> getByUserName2(String username) {
        Map<String,Object> map = new HashMap<>();
        map.put("username","1");
        return userMapper.selectByMap(map);
    }
}
