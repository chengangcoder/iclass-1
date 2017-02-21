package com.iclass.user.cache.entity;

import com.iclass.user.mybatis.model.User;
import com.iclass.utils.UserInfoHandler;

/**
 * iclass
 * <p>
 * Created by JasonTang on 2/20/2017 11:45 PM.
 */
public class    SessionUser {

    /**
     * 用户信息
     */
    private User user;

    public SessionUser() {

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
        this.user = UserInfoHandler.userpasswordHandler(user);
        this.user = UserInfoHandler.userRegisterDateHandler(user);
    }

    @Override
    public String toString() {
        return "SessionUser{" +
                "user=" + user +
                '}';
    }
}
