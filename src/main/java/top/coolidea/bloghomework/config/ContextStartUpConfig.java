package top.coolidea.bloghomework.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ServletContextAware;
import top.coolidea.bloghomework.service.ICategoryService;
import top.coolidea.bloghomework.service.IPostService;

import javax.servlet.ServletContext;

/**
 * @Auther: Administrator
 * @Date: 2019/9/9 06:56
 * @Description:
 */
@Order(1000)
@Component
public class ContextStartUpConfig implements ApplicationRunner, ServletContextAware {
    @Autowired
    private ServletContext servletContext;
    @Autowired
    IPostService postService;
    @Autowired
    ICategoryService categoryService;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        servletContext.setAttribute("base",servletContext.getContextPath());
    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;
    }
}
