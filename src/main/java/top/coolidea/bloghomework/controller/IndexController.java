package top.coolidea.bloghomework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @auther: 魏薏恩
 * @date: 2019/9/8 19:05
 * @description:
 */
@Controller
public class IndexController extends BaseController {
    @GetMapping({"","/","index"})
    public String index(){
        return "index";
    }
}

