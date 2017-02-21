package com.iclass.user.component.service.impl;

import com.iclass.user.component.exception.UserException;
import com.iclass.user.mybatis.dao.UserMapper;
import com.iclass.user.component.service.api.ValidateExistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * iclass
 * <p>
 * Created by yang.tang on 2017/2/10 14:29.
 */
@Service
public class ValidateExistServiceImpl implements ValidateExistService {

    /**
     * 用户mapper
     */
    @Autowired
    private UserMapper userMapper;

    /**
     * 描述：根据username 来查询此username是否在数据库中是否已经存在
     * 结果：
     *      存在：ture
     *      不存在：false
     * @param username
     * @return
     */
    @Override
    public Boolean isExistUsername(String username) {
        Boolean result = false;
        if(username != null) {
            result = userMapper.findByUsername(username) != null;
        } else {
            throw new UserException("4001", "用户名不能为空");
        }
        return result;
    }

    /**
     * 描述：与上面的方法一致的
     * 结果：
     *      存在：true
     *      不存在：false
     * @param usercode
     * @return
     */
    @Override
    public Boolean isExistUserCode(String usercode) {
        Boolean result = false;
        if(usercode != null) {
            result = userMapper.findByUsercode(usercode) != null;
        } else {
            throw new UserException("4002", "工号不能为空");
        }
        return result;
    }
}