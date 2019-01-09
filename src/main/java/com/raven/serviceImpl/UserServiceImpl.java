package com.raven.serviceImpl;

import com.raven.entity.User;
import com.raven.mapper.UserMapper;
import com.raven.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Qualifier("userMapper")
    @Autowired
    UserMapper userMapper;

    @Override
    public User getUser(Integer userId) {
        return userMapper.findUserById(userId);
    }

	@Override
	public List<User> listUser() {
		// TODO Auto-generated method stub
		return userMapper.selectAllUser();
	}
}
