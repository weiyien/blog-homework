package top.coolidea.bloghomework.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import top.coolidea.bloghomework.dto.result.ResultDTO;
import top.coolidea.bloghomework.entity.User;
import top.coolidea.bloghomework.service.IUserService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author weiyien
 * @since 2019-09-08
 */
@RestController
@RequestMapping("/user")
public class UserController extends BaseController {
    @Autowired
    private IUserService iUserService;
    @GetMapping("/{userid}")
    public ResultDTO getByUserId(@PathVariable int userid){
        return ResultDTO.successed(iUserService.getById(userid));
    }
    @PostMapping("/")
    public ResultDTO vreate(@RequestBody User user){
        return ResultDTO.successed(iUserService.save(user));
    }
}
