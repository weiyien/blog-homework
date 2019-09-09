package top.coolidea.bloghomework.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import top.coolidea.bloghomework.entity.User;
import top.coolidea.bloghomework.entity.UserMessage;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author weiyien
 * @since 2019-09-08
 */
public interface UserMessageMapper extends BaseMapper<UserMessage> {
    /**
     * @param s
     * @return
     */
    @Select("select * from user_message um left join user u on um.to_user_id = u.id and u.username like #{username}")
    List<UserMessage> selectByUserName(@Param("username") String s);
    @Select("select * from user_message um")
    List<UserMessage> page(Page<UserMessage> page, @Param("usermessage") UserMessage userMessage);
}
