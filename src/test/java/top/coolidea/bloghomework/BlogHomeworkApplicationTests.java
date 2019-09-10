package top.coolidea.bloghomework;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.coolidea.bloghomework.entity.User;
import top.coolidea.bloghomework.entity.UserMessage;
import top.coolidea.bloghomework.service.IUserMessageService;
import top.coolidea.bloghomework.service.IUserService;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogHomeworkApplicationTests {
    @Autowired
    private IUserMessageService iUserMessageService;
    @Autowired
    private IUserService iUserService;
    @Test
    public void contextLoads() {
//        List<UserMessage> userMessages = iUserMessageService.selectByUserName("1");
//        iUserMessageService.page(new UserMessage(),1,10);
//        iUserService.getByUserName("1");
//        iUserService.getByUserName2("1");
        QueryWrapper<User> queryWrapper=new QueryWrapper<User>();
        queryWrapper.eq("username","1");
        iUserService.getMap(queryWrapper);
    }

}
