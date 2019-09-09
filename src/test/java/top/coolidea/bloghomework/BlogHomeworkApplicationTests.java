package top.coolidea.bloghomework;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.coolidea.bloghomework.entity.UserMessage;
import top.coolidea.bloghomework.service.IUserMessageService;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogHomeworkApplicationTests {
    @Autowired
    private IUserMessageService iUserMessageService;
    @Test
    public void contextLoads() {
        List<UserMessage> userMessages = iUserMessageService.selectByUserName("1");
        iUserMessageService.page(new UserMessage(),1,10);
        System.out.println(userMessages.size());
    }

}
