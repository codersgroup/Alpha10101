package com.gotee.security.dao.accesstoken;

import com.gotee.security.dao.Dao;
import com.gotee.security.entity.AccessToken;

/**
 * @author Philip Washington Sorst <philip@sorst.net>
 */
public interface AccessTokenDao extends Dao<AccessToken, Long>
{
    AccessToken findByToken(String accessTokenString);
}
