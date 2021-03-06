package com.iclass.user.component.service.api;

import com.iclass.user.component.entity.ServiceResult;
import com.iclass.user.component.vo.SessionUser;
import com.iclass.user.mybatis.model.Student;

/**
 * iclass
 * <p>
 * Created by JasonTang on 2/20/2017 11:14 PM.
 */
public interface StudentService {

    /**
     * 保存学生信息
     * @param student 学生实体
     */
    public ServiceResult<Student> save(Student student);

    /**
     * 删除学生信息
     * @param studentCdoe 学生的学号
     */
    public ServiceResult<Student> delete(String studentCdoe);
}
