package frank.blog.controller;

import frank.blog.infrastructure.Result;
import frank.blog.model.User;
import frank.blog.service.IUserService;
import frank.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(path = "/login")
    public Result login(User user){
        userService.login(user);
        return Result.buildOK("login success");
    }

    @RequestMapping(path = "/register")
    public Result register(User user){
        userService.login(user);
        return Result.buildOK("register success");
    }

}
