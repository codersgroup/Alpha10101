package com.gotee.security.dao.user;

import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.gotee.security.dao.Dao;
import com.gotee.security.entity.User;

public interface UserDao extends Dao<User, Long>
{
    User loadUserByUsername(String username) throws UsernameNotFoundException;

    User findByName(String name);
}
