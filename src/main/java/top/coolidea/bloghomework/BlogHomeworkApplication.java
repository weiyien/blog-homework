package top.coolidea.bloghomework;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("top.coolidea.bloghomework.mapper")
@SpringBootApplication
public class BlogHomeworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogHomeworkApplication.class, args);
    }

}
