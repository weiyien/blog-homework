package top.coolidea.bloghomework.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import top.coolidea.bloghomework.entity.UserMessage;
import top.coolidea.bloghomework.mapper.UserMessageMapper;
import top.coolidea.bloghomework.service.IUserMessageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

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
    @Autowired
    private UserMessageMapper userMessageMapper;
    @Override
    public List<UserMessage> selectByUserName(String s) {
        return userMessageMapper.selectByUserName(s);
    }

    @Override
    public IPage<UserMessage> page(UserMessage userMessage, int page, int size) {
        Page<UserMessage> pageData=new Page<>(page,size);
        pageData.setRecords(userMessageMapper.page(pageData,userMessage));
        return pageData;
    }
}
