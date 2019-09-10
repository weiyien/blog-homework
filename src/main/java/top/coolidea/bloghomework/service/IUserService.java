package top.coolidea.bloghomework.service;

import top.coolidea.bloghomework.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author weiyien
 * @since 2019-09-08
 */
public interface IUserService extends IService<User> {
    List<User> getByUserName(String username);
    List<User> getByUserName2(String username);

}
