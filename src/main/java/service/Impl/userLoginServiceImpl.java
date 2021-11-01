package service.Impl;

import mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.User;
import service.userLoginService;

import javax.annotation.Resource;

@Service
public class userLoginServiceImpl implements userLoginService {

    @Resource
    @Autowired
    private UserMapper userMapper;

    @Override
    public void insert(User user) {
        userMapper.insert(user);
    }
}
