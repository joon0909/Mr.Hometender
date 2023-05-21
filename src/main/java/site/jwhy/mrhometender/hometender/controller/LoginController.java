package site.jwhy.mrhometender.hometender.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import site.jwhy.mrhometender.hometender.model.UserInfo;
import site.jwhy.mrhometender.hometender.model.req.LoginReq;
import site.jwhy.mrhometender.hometender.service.login.LoginService;

@Slf4j
@RestController
public class LoginController {
    @Autowired
    public LoginController(LoginService loginService){
        this.loginService = loginService;
    }
    private LoginService loginService;
    @PostMapping("/api/login")
    public UserInfo login(
        @RequestBody LoginReq loginReq
    ) throws Exception {
        UserInfo userInfo = loginService.selectUserInfo(loginReq);
        return userInfo;
    }
}
