package top.coolidea.bloghomework.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import top.coolidea.bloghomework.entity.UserMessage;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author weiyien
 * @since 2019-09-08
 */
public interface IUserMessageService extends IService<UserMessage> {

    List<UserMessage> selectByUserName(String s);

    IPage<UserMessage> page(UserMessage userMessage, int page, int size);
}
