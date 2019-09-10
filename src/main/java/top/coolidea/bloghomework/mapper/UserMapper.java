package top.coolidea.bloghomework.mapper;

import org.apache.ibatis.annotations.Param;
import top.coolidea.bloghomework.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author weiyien
 * @since 2019-09-08
 */
public interface UserMapper extends BaseMapper<User> {

    List<User> getByUserName(@Param("username") String username);

}
