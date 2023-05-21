package site.jwhy.mrhometender.hometender.service.login;

import org.springframework.stereotype.Service;
import site.jwhy.mrhometender.hometender.model.UserInfo;
import site.jwhy.mrhometender.hometender.model.req.LoginReq;
//@Service
public interface LoginService {
    UserInfo selectUserInfo(LoginReq loginReq) throws Exception;

}
