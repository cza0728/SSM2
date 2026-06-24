package org.example.ch111.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.ch111.mapper.Usermapper;
import org.example.ch111.pojo.User;
import org.example.ch111.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<Usermapper, User> implements UserService {
}
