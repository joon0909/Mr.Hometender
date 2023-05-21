package site.jwhy.mrhometender.hometender.service.login.Impl;


import site.jwhy.mrhometender.hometender.mapper.LoginMapper;
import site.jwhy.mrhometender.hometender.model.UserInfo;
import site.jwhy.mrhometender.hometender.model.req.LoginReq;
import site.jwhy.mrhometender.hometender.service.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    private LoginMapper loginMapper;
    @Autowired
    public LoginServiceImpl(LoginMapper loginmapper){
        this.loginMapper = loginmapper;
    }
    @Override
    public UserInfo selectUserInfo(LoginReq loginReq) throws Exception {
        UserInfo userInfo = new UserInfo();
        userInfo = loginMapper.selectUserInfo(loginReq);
        return userInfo;
    }
}
