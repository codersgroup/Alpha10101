package com.gotee.security.dao.blogpost;

import com.gotee.security.dao.Dao;
import com.gotee.security.entity.BlogPost;

/**
 * Definition of a Data Access Object that can perform CRUD Operations for {@link BlogPost}s.
 *
 * @author Philip Washington Sorst <philip@sorst.net>
 */
public interface BlogPostDao extends Dao<BlogPost, Long>
{
}
