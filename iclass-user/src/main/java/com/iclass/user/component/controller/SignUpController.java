package com.iclass.user.component.controller;

import com.iclass.user.component.msg.ResponseMsg;
import com.iclass.user.component.service.impl.SignUpServiceImpl;
import com.iclass.user.mybatis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * iclass
 * <p>
 * Created by JasonTang on 2/12/2017 4:32 PM.
 */
@RestController
@RequestMapping("/user")
public class SignUpController {

    @Autowired
    private SignUpServiceImpl signUpService;

    @RequestMapping("/signup")
    public ResponseMsg signup(User user) {
        return signUpService.signup(user);
    }
}