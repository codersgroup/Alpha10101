package com.gotee.security.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.gotee.security.entity.AccessToken;
import com.gotee.security.entity.User;

/**
 * @author Philip Washington Sorst <philip@sorst.net>
 */
public interface UserService extends UserDetailsService
{
    User findUserByAccessToken(String accessToken);

    AccessToken createAccessToken(User user);
}
