package site.jwhy.mrhometender.hometender.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import site.jwhy.mrhometender.hometender.model.UserInfo;
import site.jwhy.mrhometender.hometender.model.req.LoginReq;

@Repository
@Mapper
public interface LoginMapper {
    UserInfo selectUserInfo(LoginReq loginReq) throws DataAccessException;

}

