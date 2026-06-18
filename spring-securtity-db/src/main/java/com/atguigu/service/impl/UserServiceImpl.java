package com.atguigu.service.impl;

import com.atguigu.entity.TRole;
import com.atguigu.entity.TUser;
import com.atguigu.mapper.TRoleMapper;
import com.atguigu.mapper.TUserMapper;
import com.atguigu.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: linyu
 * @Date: 2026/6/11 21:07
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private TUserMapper tUserMapper;

    @Autowired
    private TRoleMapper tRoleMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        TUser user = tUserMapper.selectByUsername(username);

        if (user == null) {
            throw new UsernameNotFoundException("用户不存在");
        }

        List<TRole> tRoles = tRoleMapper.selectRolesByUserId(user.getId());
        user.setTRoles(tRoles);

        return user;
    }
}
