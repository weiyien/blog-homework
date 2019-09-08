package top.coolidea.bloghomework.service.impl;

import top.coolidea.bloghomework.entity.UserMessage;
import top.coolidea.bloghomework.mapper.UserMessageMapper;
import top.coolidea.bloghomework.service.IUserMessageService;
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
public class UserMessageServiceImpl extends ServiceImpl<UserMessageMapper, UserMessage> implements IUserMessageService {

}
