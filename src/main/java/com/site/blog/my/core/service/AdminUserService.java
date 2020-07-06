package com.site.blog.my.core.service;

import com.site.blog.my.core.entity.AdminUser;

public interface AdminUserService {

    AdminUser login(String userName, String password);

}
